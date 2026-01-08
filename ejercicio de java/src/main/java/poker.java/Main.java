
import java.util.*;

import com.ejercicio001.spring.app1.bootcamp.Carta;

public class Main {

    public static void main(String[] args) {

        List<Carta> mano = Arrays.asList(
            new Carta("2S"),
            new Carta("3S"),
            new Carta("4S"),
            new Carta("5S"),
            new Carta("6S")
        );

        String jugada = pokeridentificador.identificar(mano);

        System.out.println("Jugada detectada: " + jugada);
    }
}
