package cine;

import entidades.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author HP
 */
public class prueva {

    private Connection connection;

    // Constructor
    public prueva(String host, String dbName, String user, String password) {
        try {
            String url = "jdbc:mysql://" + host + "/" + dbName;
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión con la base de datos MySQL exitosa.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.");
        }
    }

    // Método para cargar películas en la cola
    public void cargarPeliculasEnCola(ColaPeliculas cola) {
        String query = "SELECT * FROM pelicula";
        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Pelicula pelicula = new Pelicula(
                        rs.getString("pelititulo"),
                        rs.getString("peligenero"),
                        rs.getString("pelicensura"),
                        rs.getString("pelilinkimagen"),
                        rs.getString("pelidirector"),
                        rs.getString("peliidioma"),
                        rs.getString("pelidisponible"),
                        rs.getString("pelidescripcion"),
                        rs.getString("peliduracion")
                );
                cola.encolar(pelicula);
            }
            System.out.println("Películas cargadas en la cola exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al cargar las películas: " + e.getMessage());
        }
    }

    // Método para cargar clientes en la pila
    public void cargarClientesEnPila(PilaCliente pila) {
        String query = "SELECT * FROM cliente"; // Cambia el nombre de la tabla según tu base de datos
        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("idcliente"),
                        rs.getString("clinombre"),
                        rs.getString("cliapellido"),
                        rs.getInt("edad"),
                        rs.getString("clicorreo"),
                        rs.getString("clicontraseña"),
                        rs.getString("tipo_documento"),
                        rs.getString("numero_documento"),
                        rs.getString("departamento"),
                        rs.getBoolean("es_socio")
                );
                pila.push(cliente); // Agrega el cliente a la pila
            }
            System.out.println("Clientes cargados en la pila exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al cargar los clientes: " + e.getMessage());
        }
    }
    
    // Cargar productos en la cola desde la base de datos
    public void cargarProductosEnCola(ColaProductos cola) {
        String query = "SELECT * FROM productos";  // Consulta para obtener productos de la base de datos
        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Producto producto = new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("tipoProducto"),
                        rs.getString("nombreProducto"),
                        rs.getDouble("precioProducto")
                );
                cola.encolar(producto);
            }
            System.out.println("Productos cargados en la cola exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al cargar productos: " + e.getMessage());
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Proveer datos de conexión
        String host = "localhost";
        String dbName = "bd_peliculas";
        String user = "root";
        String password = "administrador";

        // Crear instancia de la clase
        prueva pruebaConexion = new prueva(host, dbName, user, password);

        // Crear una cola de películas
        ColaPeliculas cola = new ColaPeliculas();

        // Crear una pila de clientes
        PilaCliente pila = new PilaCliente();

        // Cargar las películas desde la base de datos en la cola
        pruebaConexion.cargarPeliculasEnCola(cola);

        // Cargar los clientes desde la base de datos en la pila
        pruebaConexion.cargarClientesEnPila(pila);

        // Mostrar las películas en la cola
        System.out.println("Películas en la cola:");
        cola.mostrar();

        // Mostrar los clientes en la pila
        System.out.println("Clientes en la pila:");
        pila.mostrar();
        
         // Crear una cola de productos
        ColaProductos colaProductos = new ColaProductos();

        // Cargar productos desde la base de datos en la cola
        pruebaConexion.cargarProductosEnCola(colaProductos);

        // Mostrar productos en la cola
        System.out.println("Productos en la cola:");
        colaProductos.mostrar();
    }
}