package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class conversorRaioAreaQuadrado {
    public static void main(String[] args) {

        // CRIA O SCANNER
        Scanner scanner = new Scanner(System.in);

        // SOLICITAÇÃO AO USUÁRIO
        System.out.println("Digite a altura ou a largura do quadrado:");

        // LÓGICA DO CÓDIGO, RECEBE A ENTRADA DO USUÁRIO, CALCULA A ÁREA, MULTIPLICA POR 2 E EXIBE AO USUÁRIO
        float medidaQuadrado = scanner.nextFloat();
        float areaQuadrado = medidaQuadrado * medidaQuadrado;
        float dobroArea = areaQuadrado * 2;

        System.out.printf("O dobro da área do quadrado de medida %.2f é %.2f\n", medidaQuadrado, +dobroArea);

        scanner.close();

    }
}
