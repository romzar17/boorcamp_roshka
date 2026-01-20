package org.example;
import java.sql.*;

public class asignatura {
    private int id_asignatura;
    private String nom_asignatura;

    public asignatura(int id_asignatura, String nom_asignatura) {
        this.id_asignatura = id_asignatura;
        this.nom_asignatura = nom_asignatura;
    }

    public void insertar() throws SQLException {
        String sql = "INSERT INTO public.asignatura (nom_asignatura) VALUES (?)";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nom_asignatura);
            ps.executeUpdate();
        }
    }

    public void actualizar() throws SQLException {
        String sql = "UPDATE public.asignatura SET nom_asignatura = ? WHERE id_asignatura = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nom_asignatura);
            ps.setInt(2, id_asignatura);
            ps.executeUpdate();
        }
    }

    public static ResultSet mostrar() throws SQLException {
        String sql = "SELECT * FROM public.asignatura";
        Connection con = conexion.getConexion();
        return con.prepareStatement(sql).executeQuery();
    }
}