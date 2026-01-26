package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

/*package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // Tu consulta SQL validada
        String sql = """
            SELECT pr.id_prestamo_libro, c.nombre_colegio, p.nom_profesor, 
                   l.nombre_libro, ed.editorial, pr.fecha_prestamo, pr.fecha_venc
            FROM prestamo pr
            JOIN profesor p ON pr.id_profesor = p.id_profesor
            JOIN colegio_profesor cp ON p.id_profesor = cp.id_profesor
            JOIN colegio c ON cp.id_colegio = c.id_colegio
            JOIN libro l ON pr.id_libro = l.id_libro
            JOIN editorial ed ON l.id_editorial = ed.id_editorial
        """;


        try (Connection con = conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) { //datos manualmente
                System.out.println("--------------------------------------");
                System.out.println("ID: " + rs.getInt("id_prestamo_libro"));
                System.out.println("Profesor: " + rs.getString("nom_profesor"));
                System.out.println("Libro: " + rs.getString("nombre_libro"));
            }

        } catch (SQLException e) {
            System.err.println("Error de conexión o SQL: " + e.getMessage());
        }
    }
}*/
