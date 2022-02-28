package br.com.dio;

/*
programa que lê um vetor de 6 caracteres e
retorna quantas consoantes foram encontradas,
e sua impressão
 */

import java.util.Scanner;

public class ex7_consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdeConsoantes = 0;
        int contador = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                qtdeConsoantes++;
            }
            contador++;
        } while (contador < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + qtdeConsoantes);
    }
}