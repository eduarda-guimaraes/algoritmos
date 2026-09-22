package aula_0209;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /* 5) Usando a estrutura switch, proponha uma calculadora com as quatro operações
        aritméticas básicas disponibilizadas ao usuário por um menu. */

        Scanner leitor = new Scanner(System.in);
        double n1, n2;
        int opcao;

        System.out.println("Aqui está a sua calculadora nº1!");
        System.out.println("Digite a operação de sua escolha:");
        System.out.println("1 - Soma\n2 - Diferença\n3 - Multiplicação\n4 - Divisão");
        opcao = leitor.nextInt();

        while(opcao < 1 || opcao >= 5){
            System.out.println("Erro: opção não existe!");
            System.out.println("Digite a operação de sua escolha:");
            System.out.println("1 - Soma\n2 - Diferença\n3 - Multiplicação\n4 - Divisão");
            opcao = leitor.nextInt();
        }

        System.out.println("Digite o 1º número: ");
        n1 = leitor.nextDouble();
        System.out.println("Digite o 2º número: ");
        n2 = leitor.nextDouble();

        switch(opcao){
            case 1:
                System.out.println("Soma: "+ (n1 + n2));
                break;
            case 2:
                System.out.println("Diferença: "+ (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplicação: "+ (n1 * n2));
                break;
            case 4:
                System.out.println("Divisão: "+ (n1 / n2));
        }

    }
}
