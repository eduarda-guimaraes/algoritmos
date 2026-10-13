package aula_3009.matrizes;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /* 5 - Faça um programa em Java que leia dois vetores, denominados A e B, de 5
        elementos cada um, respeitando as seguintes regras:
        - Vetor A deve conter apenas valores pares;
        - Vetor B deve conter apenas valores ímpares.
        A partir dos dois vetores, crie uma matriz que:
        1. Na primeira linha armazene o vetor A
        2. Na segunda linha armazene o vetor B
        3. Na terceira linha, contenha para cada coluna a soma dos elementos da
        primeira e da segunda linha correspondentes à mesma coluna.
        Por fim, exiba a matriz resultante organizada em linhas e colunas. */
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[][] matriz = new int[3][5];

        int i, j;

        for(i=0; i<5; i++){
            do{
                System.out.println("Digite o "+ (i+1) +"º número par:");
                vetorA[i] = sc.nextInt();
                if(vetorA[i]%2!=0){
                    System.out.println("Erro: este número não é par!");
                }
            }while(vetorA[i]%2!=0);
        }

        for(i=0; i<5; i++){
            do{
                System.out.println("Digite o "+ (i+1) +"º número ímpar:");
                vetorB[i] = sc.nextInt();
                if(vetorB[i]%2==0){
                    System.out.println("Erro: este número não é ímpar!");
                }
            }while(vetorB[i]%2==0);
        }

        for(i=0; i<3; i++){
            for(j=0; j<5; j++){
                if(i==0){
                    matriz[i][j]=vetorA[j];
                }
                if(i==1){
                    matriz[i][j]=vetorB[j];
                }
                if(i==2){
                    matriz[i][j]=vetorA[j]+vetorB[j];
                }
            }
        }

        for(i=0; i<3; i++){
            for(j=0; j<5; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

    }
}
