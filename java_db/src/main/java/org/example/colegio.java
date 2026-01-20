package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class colegio {
    private int id_colegio;
    private String nombre_colegio;

    public colegio(int id_colegio, String nombre_colegio) {
        this.id_colegio = id_colegio;
        this.nombre_colegio = nombre_colegio;
    }

    public void insertar() throws SQLException {
        String sql = "INSERT INTO public.colegio (nombre_colegio) VALUES (?)";
        // CAMBIO AQUÍ: Usamos conexion.getConexion() que es lo que tienes en tu proyecto
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, this.nombre_colegio);
            ps.executeUpdate();
        }
    }

    public void actualizar() throws SQLException {
        String sql = "UPDATE public.colegio SET nombre_colegio = ? WHERE id_colegio = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, this.nombre_colegio);
            ps.setInt(2, this.id_colegio);
            ps.executeUpdate();
        }
    }

    public static ResultSet mostrar() throws SQLException {
        String sql = "SELECT * FROM public.colegio";
        // CAMBIO AQUÍ: conexion.getConexion()
        Connection con = conexion.getConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeQuery();
    }
}