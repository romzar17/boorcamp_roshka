package com.ejercicio001.spring.app1.bootcamp;
import java.util.Scanner;

public class ejercicio006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //definir el iva 
        double iva = 0.10; 

        System.out.print("Ingrese el precio");
        double precio = teclado.nextDouble();

        //precio final 
        double pfinal = precio + (precio * iva);

        //muestra el precio final 
        System.out.println("El precio final es:" + pfinal);

        teclado.close();
        
    }

}
