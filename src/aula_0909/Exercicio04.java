package aula_0909;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int opcao;

        do {
            System.out.println("1 - Somar"); System.out.println("2 - Subtrair"); System.out.println("0 - Sair"); System.out.print("Escolha uma opção: "); opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu somar.");
            } else if (opcao == 2) {
                System.out.println("Você escolheu subtrair.");
            }
        } while(opcao != 0);

        System.out.println("Programa encerrado.");

    }
}
