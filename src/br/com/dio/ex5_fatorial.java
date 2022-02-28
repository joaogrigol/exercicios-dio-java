package br.com.dio;

/*
programa que calcula fatorial
de um número fornecido pelo usuário
 */

import java.util.Scanner;

public class ex5_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int mult = 1;
        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            mult = mult * i;
        }
        System.out.println(mult);
    }
}
