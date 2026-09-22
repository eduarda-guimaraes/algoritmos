package aula_1609;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /* 2) Proponha um programa em Java que leia um número inteiro positivo ne em
        seguida exiba n linhas do chamado Triângulo de Floyd, conforme exemplificado
        abaixo:
        n = 3
        1
        23
        456 */
        Scanner leitor = new Scanner(System.in);

        int n;
        int i;
        int j;
        int contN = 1;

        System.out.println("Digite um número inteiro positivo: ");
        n = leitor.nextInt();
        while(n<=1){
            System.out.println("Erro: número deve ser maior que um!");
            System.out.println("Digite outro número: ");
            n = leitor.nextInt();
        }
        System.out.println();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(contN+" ");
                contN++;
            }
            System.out.println();
        }
    }
}
