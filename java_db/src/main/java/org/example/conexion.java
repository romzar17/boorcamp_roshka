package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static final String URL = "jdbc:postgresql://localhost:5432/demo04";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método de prueba (opcional)
    public static void main(String[] args) {
        try (Connection con = getConexion()) {
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}
