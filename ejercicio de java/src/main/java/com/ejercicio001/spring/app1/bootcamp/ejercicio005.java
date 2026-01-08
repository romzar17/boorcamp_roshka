package com.ejercicio001.spring.app1.bootcamp;
import java.util.Scanner;

public class ejercicio005 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.print("Ingrese el numero");
        int numero = valor.nextInt();

        if (numero % 2 == 0) {

            System.out.println("El numero es divisible por 2 )");
        } else {
            System.out.println("El numero no es divisible");
        }
    }

}
