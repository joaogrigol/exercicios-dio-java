package br.com.dio;

/*
programa que inverte a ordem de um array
 */

public class ex6_ordeminversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        System.out.print("Vetor: ");
        int contador = 0;
        while (contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        System.out.print("\nVetor: ");

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}