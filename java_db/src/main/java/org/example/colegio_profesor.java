package org.example;
import java.sql.*;

public class colegio_profesor {
    private int id_profesor;
    private int id_colegio;

    public colegio_profesor(int id_profesor, int id_colegio) {
        this.id_profesor = id_profesor;
        this.id_colegio = id_colegio;
    }

    public void asignar() throws SQLException {
        String sql = "INSERT INTO public.colegio_profesor (id_profesor, id_colegio) VALUES (?, ?)";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id_profesor);
            ps.setInt(2, id_colegio);
            ps.executeUpdate();
        }
    }

    public void eliminar() throws SQLException {
        String sql = "DELETE FROM public.colegio_profesor WHERE id_profesor = ? AND id_colegio = ?";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id_profesor);
            ps.setInt(2, id_colegio);
            ps.executeUpdate();
        }
    }
}