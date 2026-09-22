package aula_0209;

import java.util.Scanner;

public class exercicio01 {
    static void main(String[] args) {
        /* 1) Desenvolva um algoritmo que receba três números, calcule a média aritmética
           entre eles e exiba o valor obtido.*/
        Scanner leitor = new Scanner(System.in);

        // leitura de N números
        int cont = 1;
        double num;
        double soma = 0.0, media = 0;

        while(cont<=3){
            System.out.println("Digite o "+ cont +"º número: ");
            num = leitor.nextDouble();

            soma += num;
            cont+=1;
        }

        media = soma/3;

        System.out.println("A média aritmética é: "+ media);

    }
}
