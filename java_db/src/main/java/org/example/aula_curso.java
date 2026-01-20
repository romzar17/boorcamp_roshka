package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class aula_curso {
    private int id_aula;
    private int id_curso;

    public aula_curso(int id_aula, int id_curso) {
        this.id_aula = id_aula;
        this.id_curso = id_curso;
    }

    // Método para crear la relación
    public void insertar() throws SQLException {
        String sql = "INSERT INTO public.aula_curso (id_aula, id_curso) VALUES (?, ?)";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id_aula);
            ps.setInt(2, id_curso);
            ps.executeUpdate();
        }
    }

    // Método para eliminar la relación
    public void eliminar() throws SQLException {
        String sql = "DELETE FROM public.aula_curso WHERE id_aula = ? AND id_curso = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id_aula);
            ps.setInt(2, id_curso);
            ps.executeUpdate();
        }
    }

    // Método para ver qué aulas están con qué cursos
    public static ResultSet mostrar() throws SQLException {
        String sql = "SELECT * FROM public.aula_curso";
        Connection con = conexion.getConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeQuery();
    }
}