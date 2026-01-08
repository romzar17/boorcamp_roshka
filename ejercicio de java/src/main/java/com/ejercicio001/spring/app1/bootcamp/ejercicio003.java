package com.ejercicio001.spring.app1.bootcamp;
import java.util.Scanner; //impotacion de libreria para mostrar en pantalla 

public class ejercicio003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //abrir el scanner 

        System.out.println("Ingrese tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre);

        sc.close(); // cerramos el scanner 
    }
}
