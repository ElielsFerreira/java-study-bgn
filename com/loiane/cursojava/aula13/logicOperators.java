package com.loiane.cursojava.aula13;

public class logicOperators {
    public static void main(String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);   // && = CURTO CIRCUITO
        System.out.println(resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println(resultado2);

    }
}
