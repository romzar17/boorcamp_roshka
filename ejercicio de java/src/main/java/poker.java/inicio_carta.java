// package com.ejercicio001.spring.app1.bootcamp;   // opcional

public class inicio_carta {

    private char valor;
    private char palo;

    // ✔ CORREGIDO: constructor con mismo nombre
    public inicio_carta(String rep) {
        this.valor = rep.charAt(0);
        this.palo  = rep.charAt(1);
    }

    public int getValorNumerico(boolean Escaleras) {

        switch (valor) {

            case 'A': return Escaleras ? 14 : 1;

            case 'T': return 10;

            case 'J': return 11;

            case 'Q': return 12;

            case 'K': return 13;

            default : return Character.getNumericValue(valor);

        } // fin switch
    } // fin función

    public char getPalo() {
        return palo;
    }

    public char getValor() {
        return valor;
    }
}
