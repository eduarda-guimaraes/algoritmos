package aula_3009.arrays;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /* 5 - Faça um programa Java que receba do usuário dois arrays, A e B, com 10
        números inteiros cada. Crie um novo array C = A – B, mostre na tela os dados do
        array C. */
        Scanner sc  = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        int i;

        for(i=0; i<10; i++){
            System.out.println("Digite o "+(i+1)+"º número do array A: ");
            a[i] = sc.nextInt();
            System.out.println("Digite o "+(i+1)+"º número do array B: ");
            b[i] = sc.nextInt();

            c[i] = a[i]-b[i];
        }

        for(i=0; i<10; i++){
            System.out.println("Subtração da posição "+i+": ");
            System.out.println(a[i]+" - "+b[i]+" = "+c[i]);
        }
    }

}
