package org.example;
import java.sql.*;

public class aula {
    private int id_aula;
    private int id_colegio;

    public aula(int id_aula, int id_colegio) {
        this.id_aula = id_aula;
        this.id_colegio = id_colegio;
    }
//probar si funciona
    public void insertar() throws SQLException {
        String sql = "INSERT INTO public.aula (id_colegio) VALUES (?)";
        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id_colegio);
            ps.executeUpdate();

            //preguntar si es nesario eliminar a Elias!
        }
    }
}