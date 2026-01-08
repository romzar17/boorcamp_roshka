package poker;

import java.util.*;
import com.ejercicio001.spring.app1.bootcamp.Carta;

public class identificador {

    public static String identificar(List<Carta> cartas) {

        // ----- COLOR -----
        boolean color = true;
        char paloBase = cartas.get(0).getPalo();

        for (Carta c : cartas) {
            if (c.getPalo() != paloBase) {
                color = false;
                break;
            }
        }

        // ----- CONTEO -----
        Map<Integer,Integer> conteo = new HashMap<>();

        List<Integer> valores    = new ArrayList<>();
        List<Integer> valoresEsc = new ArrayList<>();

        for (Carta c : cartas) {

            int vNormal   = c.getValorNumerico(false);
            int vEscalera = c.getValorNumerico(true);

            valores.add(vNormal);
            valoresEsc.add(vEscalera);

            conteo.put(vNormal,
                conteo.getOrDefault(vNormal,0) + 1);
        }

        // frecuencias
        List<Integer> frec =
            new ArrayList<>(conteo.values());

        frec.sort(Collections.reverseOrder());

        // ----- ESCALERA -----
        boolean escaleraNormal =
            esEscalera(valoresEsc);

        boolean escaleraBaja =
            new HashSet<>(valores)
                .equals(new HashSet<>(
                    Arrays.asList(1,2,3,4,5)));

        boolean escalera =
            escaleraNormal || escaleraBaja;

        // ----- REGLAS -----
        if (color && escalera)
            return "Escalera Color";

        if (frec.equals(Arrays.asList(4,1)))
            return "Poker";

        if (frec.equals(Arrays.asList(3,2)))
            return "Full House";

        if (color)
            return "Color";

        if (escalera)
            return "Escalera";

        if (frec.equals(Arrays.asList(3,1,1)))
            return "Trío";

        if (frec.equals(Arrays.asList(2,2,1)))
            return "Par Doble";

        if (frec.equals(Arrays.asList(2,1,1,1)))
            return "Par";

        return "Carta Alta";
    }

    private static boolean esEscalera(List<Integer> vals) {

        Collections.sort(vals);

        for (int i = 0; i < vals.size()-1; i++) {
            if (vals.get(i)+1 != vals.get(i+1))
                return false;
        }
        return true;
    }
}
