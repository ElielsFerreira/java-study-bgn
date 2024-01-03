package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class salarioHora {
    public static void main(String[] args) {

        // CRIA O SCANNER PARA ENTRADA DO USUÁRIO E SOLICITA ENTRADA DE VALORES
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valorHora = scanner.nextDouble();

        System.out.println("Quantas horas você trabalha por dia?");
        double horaDia = scanner.nextDouble();

        System.out.println("Quantos dias você trabalha por mês?(máximo 31 dias)");
        int diaMes = scanner.nextInt();

        // LÓGICA PARA CALCULAR O SALÁRIO MENSAL E IMPRIMIR NA TELA, NÃO EXECUTA CASO O USUÁRIO INSIRA MAIS DE 31 DIAS

        if (diaMes <= 31) {
            double salarioMes = valorHora * horaDia * diaMes;
            System.out.println("O seu salário mensal é " + salarioMes + " reais.");
        } else {
            System.out.println("Número de dias inválido.");
        }

        scanner.close();

    }
}
