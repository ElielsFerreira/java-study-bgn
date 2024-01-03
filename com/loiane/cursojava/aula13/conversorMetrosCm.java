package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class conversorMetrosCm {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros para conversão:");
        String input = inputNumber.nextLine();

        if (input.contains(".")) {
            System.out.println("Por favor, utilize vírgula para separar os decimais.");
        } else {
            double metros = Double.parseDouble(input.replace(',', '.'));

            double centimetros = metros * 100;
            System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");
        }


    }
}
