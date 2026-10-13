package aula_3009.matrizes;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /* 1 - Crie uma matriz de dimensões 3x3 a partir de números inteiros positivos lidos
        pelo usuário. Seu programa Java deve controlar que essa leitura para aceitar apenas
        valores válidos. Em seguida, exiba os elementos da diagonal principal e os
        elementos da diagonal secundária. */
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int i, j;
        boolean valido = true;

        // i = linha j = coluna
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                do {
                    System.out.println("Digite o número da posição ["+i+"]["+j+"]: ");
                    matriz[i][j] = sc.nextInt();
                    if(matriz[i][j]<=0){
                        valido = false;
                        System.out.println("Erro: número inválido!!");
                    }
                }while(valido == false);
            }
        }

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if (i == j || i + j == 2) {
                    System.out.printf("%3d", matriz[i][j]);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
