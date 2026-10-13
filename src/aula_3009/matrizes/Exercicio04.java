package aula_3009.matrizes;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /* 4 - Proponha um algoritmo, em Java, que realize a inicialização da matriz quadrada
        de x elementos informados pelo usuário, em que a diagonal principal tem todos os
        elementos igual a um e os demais iguais a zero. */
        Scanner sc = new Scanner(System.in);

        int i, j, x;

        do{
            System.out.println("Digite a quantidade de linhas e colunas para a matriz quadrada: ");
            x = sc.nextInt();
            if(x<1){
                System.out.println("Erro: quantidade inválida!");
            }
        }while(x<1);

        int[][] matriz = new int[x][x];

        for(i=0; i<x; i++){
            for(j=0; j<x; j++){
                if(i==j){
                    matriz[i][j] = 1;
                    System.out.print(matriz[i][j]+" ");
                }
                else{
                    matriz[i][j] = 0;
                    System.out.print(matriz[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
