package aula_2110;

import java.util.Scanner;

public class Exercicio01 {
    /* 1 - Proponha uma função em Java chamada soma, a qual implementa a soma de
        dois valores reais sem retorno.
    */

    public static void soma(double n1, double n2){
        double soma =  n1 + n2;
        System.out.println("Soma dos números digitados: "+soma);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextDouble();

        soma(n1, n2);
    }
}
