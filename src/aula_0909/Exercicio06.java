package aula_0909;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (negativo para parar): "); numero = sc.nextInt();
            if (numero >= 0) {
                soma = soma + numero;
            }
        } while (numero >= 0);

        System.out.println("Soma total: " + soma);

    }
}
