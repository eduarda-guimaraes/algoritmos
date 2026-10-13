package aula_3009.arrays;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /* 2 - Escreva um programa Java que leia do teclado um vetor de 10 posições. Escreva
        na tela quantos valores pares foram armazenados nesse vetor.
         */
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[10];
        int par = 0, i = 0;

        for(i=0; i<vetor.length; i++){
            System.out.println("Digite o "+ (i+1) +"º número: ");
            vetor[i] = sc.nextDouble();
            if(vetor[i]%2==0){
                par++;
            }
        }
        System.out.println("Foram armazenados "+par+" valores pares no vetor.");
    }
}
