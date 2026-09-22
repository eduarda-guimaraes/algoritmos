package aula_0909;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); final int ANO_ATUAL = 2026;

        System.out.print("Informe o ano de nascimento: ");
        int ano = sc.nextInt();

        while (ano <= 0) {
            System.out.println("Erro: ano inválido!"); System.out.print("Informe o ano de nascimento: ");
            ano = sc.nextInt();
        }

        int idade = ANO_ATUAL - ano;
        System.out.println("Sua idade é: " + idade);
    }
}
