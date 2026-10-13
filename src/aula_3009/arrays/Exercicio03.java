package aula_3009.arrays;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /* 3 - Faça um programa Java que receba do usuário um vetor X de 10 posições. Em
        seguida deverão ser impressos o maior e o menor elemento desse vetor.
         */
        Scanner sc = new Scanner(System.in);

        double[] x = new double[10];
        double maior = 0, menor = 0;
        int i;

        for(i=0; i<10; i++){
            System.out.println("Digite o "+(i+1)+"º número: ");
            x[i] = sc.nextDouble();
            if(i == 0){
                maior = x[i];
                menor = x[i];
            }

            if(x[i] > maior){
                maior = x[i];
            }
            if(x[i] < menor){
                menor = x[i];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}
