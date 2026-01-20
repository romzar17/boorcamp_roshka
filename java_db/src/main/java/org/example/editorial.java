package org.example;
import org.example.conexion;

import java.sql.*;

public class editorial {
    private int id_editorial;
    private String nombre_editorial;

    public editorial(int id_editorial, String nombre_editorial) {
        this.id_editorial = id_editorial;
        this.nombre_editorial = nombre_editorial;
    }

    public void insertar() throws SQLException {
        String sql = "INSERT INTO public.editorial (editorial) VALUES (?)";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre_editorial);
            ps.executeUpdate();
        }
    }

    public static ResultSet mostrar() throws SQLException {
        String sql = "SELECT * FROM public.editorial";
        Connection con = conexion.getConexion();
        return con.prepareStatement(sql).executeQuery();
    }
}