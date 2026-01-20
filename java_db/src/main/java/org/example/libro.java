package org.example;
import java.sql.*;

public class libro {
    private int id_libro;
    private String nombre_libro;
    private int id_editorial;

    public libro(int id_libro, String nombre_libro, int id_editorial) {
        this.id_libro = id_libro;
        this.nombre_libro = nombre_libro;
        this.id_editorial = id_editorial;
    }

    public void insertar() throws SQLException {
        //  no se inserta manualmente
        String sql = "INSERT INTO public.libro (nombre_libro, id_editorial) VALUES (?, ?)";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre_libro);
            ps.setInt(2, id_editorial);
            ps.executeUpdate();
        }
    }

    public static ResultSet mostrar() throws SQLException {
        String sql = "SELECT * FROM public.libro";
        Connection con = conexion.getConexion();
        return con.prepareStatement(sql).executeQuery();
    }
}