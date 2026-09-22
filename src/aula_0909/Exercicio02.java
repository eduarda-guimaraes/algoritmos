package aula_0909;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.print("Digite N: ");
        int n = sc.nextInt();

        while (n>=1) {
            System.out.println(n);
            n--;
        }
        System.out.println("Fogo!");

    }
}
