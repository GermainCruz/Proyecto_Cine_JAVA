/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta;

/**
 *
 * @author Harry
 */
import java.sql.*;
import java.util.Scanner;

public class SistemaDeCine {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_peliculas";
    private static final String USER = "root"; // Cambia según tu configuración
    private static final String PASSWORD = "12345"; // Cambia según tu configuración

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("=== SISTEMA DE VENTAS ===");

            while (true) {
                System.out.println("1. Registrar Venta");
                System.out.println("2. Salir");
                System.out.print("Selecciona una opción: ");
                int opcion = scanner.nextInt();

                if (opcion == 1) {
                    registrarVenta(connection, scanner);
                } else if (opcion == 2) {
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                } else {
                    System.out.println("Opción inválida.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void registrarVenta(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("¿El cliente es socio? (si/no): ");
        String esSocio = scanner.next();

        int idCliente = -1;
        String tipoDocumento = null;
        String numeroDocumento;

        if (esSocio.equalsIgnoreCase("si")) {
            System.out.print("Ingrese número de documento del socio: ");
            numeroDocumento = scanner.next();
            idCliente = obtenerIdCliente(connection, numeroDocumento);
            tipoDocumento = obtenerTipoDocumentoCliente(connection, numeroDocumento);

            if (idCliente == -1) {
                System.out.println("Cliente no encontrado.");
                return;
            }
        } else {
            System.out.print("Ingrese tipo de documento: ");
            tipoDocumento = scanner.next();
            System.out.print("Ingrese número de documento: ");
            numeroDocumento = scanner.next();
        }
        

        System.out.print("Seleccione método de pago (tarjeta/billetera): ");
        String metodoPago = scanner.next();
        String numeroTarjeta = null, cvv = null, fechaVencimiento = null, numeroCelular = null;

        if (metodoPago.equalsIgnoreCase("tarjeta")) {
            System.out.print("Ingrese número de tarjeta: ");
            numeroTarjeta = scanner.next();
            System.out.print("Ingrese CVV: ");
            cvv = scanner.next();
            System.out.print("Ingrese fecha de vencimiento (YYYY-MM-DD): ");
            fechaVencimiento = scanner.next();
        } else if (metodoPago.equalsIgnoreCase("billetera")) {
            System.out.print("Ingrese número de celular: ");
            numeroCelular = scanner.next();
        }

        int idVenta = insertarVenta(connection, idCliente, metodoPago, numeroTarjeta, cvv, fechaVencimiento, numeroCelular, tipoDocumento, numeroDocumento);
        if (idVenta != -1) {
            agregarDetalles(connection, scanner, idVenta);
        }
    }

    private static int obtenerIdCliente(Connection connection, String numeroDocumento) throws SQLException {
        String query = "SELECT idcliente FROM cliente WHERE numero_documento = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, numeroDocumento);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("idcliente");
            }
        }
        return -1;
    }

    private static String obtenerTipoDocumentoCliente(Connection connection, String numeroDocumento) throws SQLException {
        String query = "SELECT tipo_documento FROM cliente WHERE numero_documento = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, numeroDocumento);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("tipo_documento");
            }
        }
        return "N/T";
    }

    private static int insertarVenta(Connection connection, int idCliente, String metodoPago, String numeroTarjeta, String cvv, String fechaVencimiento, String numeroCelular, String tipoDocumento, String numeroDocumento) throws SQLException {
        String query = "INSERT INTO venta (idcliente, metodopago, numero_tarjeta, cvv, fecha_vencimiento, numero_celular, tipo_documento, numero_documento, totalventa) VALUES (?, ?, ?, ?, ?, ?, ?, ?, 0)";
        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setObject(1, idCliente > 0 ? idCliente : null);
            statement.setString(2, metodoPago);
            statement.setString(3, numeroTarjeta);
            statement.setString(4, cvv);
            statement.setString(5, fechaVencimiento);
            statement.setString(6, numeroCelular);
            statement.setString(7, tipoDocumento);
            statement.setString(8, numeroDocumento);

            statement.executeUpdate();
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next()) {
                return keys.getInt(1);
            }
        }
        return -1;
    }

    private static void agregarDetalles(Connection connection, Scanner scanner, int idVenta) throws SQLException {
        while (true) {
            System.out.println("1. Agregar entrada");
            System.out.println("2. Agregar producto");
            System.out.println("3. Finalizar");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                agregarEntrada(connection, scanner, idVenta);
            } else if (opcion == 2) {
                agregarProducto(connection, scanner, idVenta);
            } else if (opcion == 3) {
                System.out.println("Venta registrada exitosamente.");
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }

    private static void agregarEntrada(Connection connection, Scanner scanner, int idVenta) throws SQLException {
        System.out.print("Ingrese la cantidad de entradas que desea comprar: ");
        int cantidad = scanner.nextInt();
        System.out.print("Ingrese ID de la película: ");
        int idPelicula = scanner.nextInt();
        System.out.print("Ingrese hora de la película (HH:MM): ");
        String hora = scanner.next();

        double subtotalTotal = 0.0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.printf("Ingrese la edad para la entrada #%d: ", i);
            int edad = scanner.nextInt();

            // Determinar el precio según la edad
            double precioEntrada = (edad <= 12 || edad >= 70) ? 10.0 : 15.0;
            subtotalTotal += precioEntrada;

            // Registrar cada entrada individualmente en la base de datos
            String query = "INSERT INTO detalleventa_peliculas (idventa, idpelicula, pelicantidad, pelihora, subtotal) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, idVenta);
                statement.setInt(2, idPelicula);
                statement.setInt(3, 1); // Siempre 1 porque es por entrada individual
                statement.setString(4, hora);
                statement.setDouble(5, precioEntrada);

                statement.executeUpdate();
            }
            System.out.printf("Entrada #%d registrada: Precio: %.2f%n", i, precioEntrada);
        }

        // Actualizar el total de la venta con el subtotal acumulado
        actualizarTotalVenta(connection, idVenta, subtotalTotal);
        System.out.printf("Subtotal total de las entradas: %.2f%n", subtotalTotal);
    }

    private static void agregarProducto(Connection connection, Scanner scanner, int idVenta) throws SQLException {
        System.out.print("Ingrese ID del producto: ");
        int idProducto = scanner.nextInt();
        System.out.print("Ingrese cantidad: ");
        int cantidad = scanner.nextInt();

        double precio = obtenerPrecioProducto(connection, idProducto, cantidad);
        String query = "INSERT INTO detalleventa_productos (idventa, idproducto, cantidad, subtotal) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idVenta);
            statement.setInt(2, idProducto);
            statement.setInt(3, cantidad);
            statement.setDouble(4, precio);

            statement.executeUpdate();
        }
    }

    private static double obtenerPrecioProducto(Connection connection, int idProducto, int cantidad) throws SQLException {
        String query = "SELECT precioproducto FROM productos WHERE idproducto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idProducto);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getDouble("precioproducto") * cantidad;
            }
        }
        return 0;
    }

    private static void actualizarTotalVenta(Connection connection, int idVenta, double subtotal) throws SQLException {
        String query = "UPDATE venta SET totalventa = totalventa + ? WHERE idventa = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, subtotal);
            statement.setInt(2, idVenta);
            statement.executeUpdate();
        }
    }

}
