package aula_1609;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        // contagem
        /* 1) Proponha um programa em Java que lê uma variável n, inteira e maior que zero,
        que representa o número de linhas da figura que segue o padrão a seguir:
        n= 5
        *****
        ****
        ***
        **
        *
         */

        Scanner leitor = new Scanner(System.in);
        int n;

        System.out.println("Digite a quantidade de linhas que você quer na figura: ");
        n = leitor.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println("*");
        }


    }
}
