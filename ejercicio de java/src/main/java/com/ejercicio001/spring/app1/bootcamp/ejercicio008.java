package com.ejercicio001.spring.app1.bootcamp;

import java.util.Scanner;

public class ejercicio008 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); // CORRECTO
        int numero;

        
        do {
            System.out.print("Ingrese un numero igual o mayor a cero: ");
            numero = teclado.nextInt();

            if (numero < 0) {
                System.out.println("El numero no es valido");
            }

        } while (numero < 0); 

        // Mostrar número válido
        System.out.println("EL NUMERO ES: " + numero);

        teclado.close(); // cerrar scanner al final
    }
}
