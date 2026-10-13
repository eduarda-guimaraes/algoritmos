package aula_3009.matrizes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /* 3 - Proponha um programa em Java que lê uma matriz A, com 2 linhas e 2 colunas.
        A matriz A deve aceitar apenas números positivos. O programa também deve ter
        uma matriz B com as mesmas dimensões de A, por sua vez, inicializada como valor
        2 em todas as posições. A partir das duas matrizes, crie a matriz R, correspondente
        ao resto da divisão inteira dos elementos correspondentes nas matrizes A e B, e a
        exiba no formato de matriz.
         */
        Scanner sc = new Scanner(System.in);

        double[][] matrizA = new double[2][2];
        double[][] matrizB = new double[2][2];
        double[][] matrizR = new double[2][2];

        int i, j;

        for(i=0; i<2; i++){
            for(j=0; j<2; j++){
                do{
                    System.out.println("Digite o número positivo ["+i+"]["+j+"]: ");
                    matrizA[i][j] = sc.nextDouble();
                    if(matrizA[i][j]<1){
                        System.out.println("Erro: número não positivo!");
                    }
                }while(matrizA[i][j]<1);
            }
        }

        for(i = 0; i < 2; i++){
            for(j = 0; j < 2; j++){
                matrizB[i][j] = 2;
            }
        }

        for(i = 0; i < 2; i++){
            for(j = 0; j < 2; j++){
                matrizR[i][j] = matrizA[i][j] % matrizB[i][j];
                System.out.printf("%.0f ", matrizR[i][j]);
            }
            System.out.println();
        }

    }
}
