package com.loiane.cursojava.aula13;

public class Timer10to0 {
    public static void main(String[] args) {


        for (int A = 10; A >= 1; A--) {
            System.out.println("Iniciando em.. " + A);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}