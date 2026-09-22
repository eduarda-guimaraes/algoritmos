package aula_0209;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        /* 2) Escreva um algoritmo que receba um número inteiro e determine se ele é par ou
        ímpar. O programa deve imprimir "Par" se o número for divisível por 2 e "Ímpar"
        caso contrário. Lembre-se do operador %.
         */
        Scanner leitor = new Scanner(System.in);

        int num;

        System.out.println("Digite um número:");
        num = leitor.nextInt();

        if(num % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Ímpar");

        leitor.close();
    }
}
