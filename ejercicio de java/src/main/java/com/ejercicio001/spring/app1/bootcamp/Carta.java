package com.ejercicio001.spring.app1.bootcamp;

    public class Carta {

    private char valor;
    private char palo;

    public Carta(String rep) {
        this.valor = rep.charAt(0);
        this.palo  = rep.charAt(1);
        
    }
        public int getValorNumerico( boolean Escaleras){

                switch (valor) {
                    case'A': return Escaleras ? 14 : 1 ;
                    case 'T' : return 10;
                    case 'J' : return 11;
                    case 'Q' : return 12;
                    case 'K' : return 13;
                    default: return Character.getNumericValue(valor);
                } //fin case

        } //fin de la fucion escaleras

        public char getPalo(){
            return palo; 
        }

        public char getValor(){
            return valor;  
        }


    
}
