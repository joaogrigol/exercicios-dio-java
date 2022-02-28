package br.com.dio;

/*
programa que pede n números
e exibe a qtde de pares e ímpares
 */


import java.util.Scanner;

public class ex3_par_impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros = 0;
        int numero;
        int qtdPares = 0;
        int qtdImpares = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0)
                qtdPares++;
            else qtdImpares++;
            contador = contador + 1;
        } while (contador < qtdNumeros);
        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);
    }
}
