package aula_3009.arrays;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /* 1 - Faça um programa Java que leia um vetor de oito posições. Em seguida, leia
        também dois valores X e Y quaisquer correspondentes as duas posições no vetor.
        Seu programa deverá exibir a soma dos valores encontrados nas respectivas
        posições X e Y. */
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[8];
        int x, y, i = 0;

        for(i=0; i<vetor.length; i++){
            System.out.println("Digite o "+(i+1)+"º número inteiro: ");
            vetor[i] = sc.nextInt();
        }

        do{
            System.out.println("Digite um valor X inteiro entre 0 e 7: ");
            x = sc.nextInt();
            if(x<0 || x>7){
                System.out.println("Erro: número inválido!");
            }
        }while(x<0 || x>7);
        do{
            System.out.println("Digite um valor Y inteiro entre 0 e 7: ");
            y = sc.nextInt();
            if(y<0 || y>7){
                System.out.println("Erro: número inválido!");
            }
        }while(y<0 || y>7);

        System.out.println("A soma dos valores destas posições é: "+ (vetor[x]+vetor[y]));
    }
}
