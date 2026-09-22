package aula_0209;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        /* 10) Proponha um programa que lê uma variável n, inteira e maior que zero, que
        representa o número de linhas da figura que segue o padrão a seguir:
        n = 4
        *****
        *****
        *****
        *****
        Importante: o programa não deve aceitar valor de n menor ou igual a zero. */

        Scanner leitor = new Scanner(System.in);
        int cont = 1, cont2 = 1, n;

        System.out.println("Digite um número inteiro: ");
        n = leitor.nextInt();

        while( n <= 0){
            System.out.println("Erro: número igual ou menor que zero!\nDigite novamente: ");
            n = leitor.nextInt();
        }

        while(cont < n){
            System.out.println("*****");
            cont+=1;
        }

        leitor.close();
    }
}
