package br.com.dio;

import java.util.Scanner;

/*
programa que lê 5 números
e retorna o maior deles e sua média
*/

public class ex2_maior_media{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            contador = contador + 1;
        } while (contador < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Mèdia: " + (soma/5));
    }

}
