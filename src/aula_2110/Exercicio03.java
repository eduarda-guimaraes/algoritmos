package aula_2110;

import java.util.Scanner;

public class Exercicio03 {
    /* 3 - Proponha uma função em Java chamada multiplicação, a qual implementa o
    produto de dois valores reais com retorno do valor calculado. */

    public static double multiplicacao(double n1, double n2){
        return n1 * n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, resultado;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextDouble();
        resultado = multiplicacao(n1, n2);
        System.out.println("Multiplicação dos números digitados: " + resultado);
    }
}
