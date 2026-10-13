package aula_3009.matrizes;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        /* 2 -Desenvolva um programa em Java em que o usuário informa 12 números inteiros,
        os quais devem ser armazenados em uma matriz. Com os dados armazenados em
        memória, seu programa deve exibir a matriz, e o menor elemento de cada linha, e o
        maior elemento de cada coluna. */
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][3];
        int i, j, menorLinha = 0, maiorColuna = 0;

        for(i = 0; i < 4; i++){
            System.out.println("== Linha "+ i +" ==");
            for(j = 0; j < 3; j++){
                System.out.println("Digite o "+ (j+1) +"º número:");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < 4; i++){
            for (j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for(i = 0; i < 4; i++){
            for(j = 0; j < 3; j++){
                if(j==0){
                    menorLinha = matriz[i][j];
                }
                if(matriz[i][j]<menorLinha){
                    menorLinha = matriz[i][j];
                }
            }
            System.out.println("\nO menor número da linha "+ i +" é: "+menorLinha);
        }

        for(j=0; j<3; j++){
            for(i=0; i<4; i++){
                if(i==0){
                    matriz[i][j] = maiorColuna;
                }
                if(matriz[i][j]>maiorColuna){
                    maiorColuna = matriz[i][j];
                }
            }
            System.out.println("\nO maior número da coluna "+ j +" é: "+maiorColuna);
        }
    }
}
