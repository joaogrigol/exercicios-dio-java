package br.com.dio;

import java.util.Scanner;

public class ex1_nota_valida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota <0 | nota>10){
            System.out.printf("Nota inválida. Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
