package br.com.dio;

/*
programa que lê 20 números inteiros de 0 a 100 e os
armazena em um vetor. Ao final, exibe os números e
seus sucessores
 */

import java.util.Random;

public class ex8_numerosaleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");

        }
        System.out.println("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}