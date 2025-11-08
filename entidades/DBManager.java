/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.*;

/**
 *
 * @author Harry
 */
public class DBManager {

    private Connection connection;

    public DBManager(String host, String dbName, String user, String password) {
        try {
            String url = "jdbc:mysql://" + host + "/" + dbName + "?useSSL=false";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión con la base de datos MySQL exitosa.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inicializarSala(int filas, int columnas) {
        try {
            Statement stmt = connection.createStatement();
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    // Inserta solo si la butaca no existe
                    String query = "INSERT IGNORE INTO Butacas (fila, columna, disponible) VALUES (" + i + ", " + j + ", true)";
                    stmt.executeUpdate(query);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet obtenerButacas() {
        try {
            Statement stmt = connection.createStatement();
            return stmt.executeQuery("SELECT * FROM Butacas");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizarButaca(int fila, int columna, boolean disponible) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE Butacas SET disponible = ? WHERE fila = ? AND columna = ?");
            stmt.setBoolean(1, disponible);
            stmt.setInt(2, fila);
            stmt.setInt(3, columna);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
