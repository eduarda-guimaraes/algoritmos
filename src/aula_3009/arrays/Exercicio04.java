package aula_3009.arrays;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /* 4 - Faça um programa Java que preencha um vetor de 10 números reais. Em seguida,
        calcule e mostre na tela a quantidade de números negativos e a soma dos números
        positivos desse vetor */
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[10];
        double soma = 0;
        int i, negat = 0;

        for(i=0; i<10; i++){
            System.out.println("Digite o "+(i+1)+"º número do vetor: ");
            vetor[i] = sc.nextDouble();

            if(vetor[i]<0){
                negat++;
            }
            else{
                soma += vetor[i];
            }
        }

        System.out.println("Quantidade de números negativos: "+ negat);
        System.out.println("Soma dos números positivos: "+ soma);
    }

}
