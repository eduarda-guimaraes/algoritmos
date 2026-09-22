package aula_0909;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int opcao;

        // Código original com problema (NÃO COMPILA):
        // while (opcao != 0) {
        //	System.out.println("1 - Continuar | 0 - Sair");
        //	opcao = sc.nextInt();
        // }

        do{
            System.out.println("1 - Continuar | 0 - Sair");
            opcao = sc.nextInt();
        }while(opcao != 0);

        System.out.println("Fim do programa.");

    }
}
