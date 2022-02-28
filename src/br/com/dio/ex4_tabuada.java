package br.com.dio;

/*
gerador de tabuada
 */

import java.util.Scanner;

public class ex4_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a tabuada que quer visualizar: ");
        int tabuada = scan.nextInt();
        System.out.println("Tabuada do " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + "x" + i + " = " + (tabuada * i));
        }

    }
}