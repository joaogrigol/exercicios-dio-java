package br.com.dio;

/*
programa que gera e imprime uma matriz 4x4
com valores aleatórios entre 0 e 9.
 */

import java.util.Random;
import java.util.Scanner;

public class ex9_matriz4x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        //TODO: Complete os espaços em branco com as respectivas variáveis para o cálculo da média.
        media = (A * 3.3 + B * 5.0) / 11;

        //TODO: Complete com a variável que representa o resultado da média.
        System.out.printf("MEDIA = %.5f", media);
        System.out.println();

    }
}

