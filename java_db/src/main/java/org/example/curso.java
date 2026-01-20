package org.example;
import java.sql.*;

public class curso {
    private int id_curso;
    private String nombre_curso; // En tu SQL la columna se llama 'curso'

    public curso(int id_curso, String nombre_curso) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
    }

    public void insertar() throws SQLException {
        String sql = "INSERT INTO public.curso (curso) VALUES (?)";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre_curso);
            ps.executeUpdate();
        }
    }

    public static ResultSet mostrar() throws SQLException {
        String sql = "SELECT * FROM public.curso";
        Connection con = conexion.getConexion();
        return con.prepareStatement(sql).executeQuery();
    }
}