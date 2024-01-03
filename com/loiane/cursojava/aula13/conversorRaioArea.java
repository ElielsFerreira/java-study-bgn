package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class conversorRaioArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo:");

        float pi = 3.14F;
        float raio = scanner.nextFloat();
        float area = pi * (raio * 2);

        System.out.printf("A área do circulo é %.2f\n", area);

        scanner.close();

    }
}
