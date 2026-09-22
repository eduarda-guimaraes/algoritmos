package aula_0209;

import java.util.Scanner;

public class TesteLinhaColuna {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int cont = 0, cont2 = 0, n;

        System.out.println("Digite um número inteiro: ");
        n = leitor.nextInt();

        while( n <= 0){
            System.out.println("Erro: número igual ou menor que zero!\nDigite novamente: ");
            n = leitor.nextInt();
        }

        while (cont < n) {
            while (cont2 < n) {
                System.out.print("* ");
                cont2++;
            }
            System.out.println();
            cont++;
            cont2 = 0;
        }
    }
}
