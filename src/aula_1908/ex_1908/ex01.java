package aula_1908.ex_1908;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        /* 1. Proponha um algoritmo em Java que peça ao usuário que digite 2 números, obtenha
        esses dois valores, calcule e exiba: a soma, o produto, a diferença e a divisão.*/
        Scanner leitor = new Scanner(System.in);

        double n1, n2, soma, produto, diferenca, divisao;

        System.out.println("Vamos descobrir a soma, o produto, a diferença e a divisão de dois números?\n");

        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextDouble();
        System.out.println("\nDigite o segundo número: ");
        n2 = leitor.nextDouble();

        soma = n1+n2;
        produto = n1*n2;
        diferenca = n1-n2;
        divisao = n1/n2;

        System.out.println("A soma do número é: "+ soma);
        System.out.println("O produto do número é: "+ produto);
        System.out.println("A diferença do número é: "+ diferenca);
        System.out.println("A divisão do número é: "+ divisao);
    }
}
