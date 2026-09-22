package aula_0209;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /* 8) Desenvolva um programa que receba 2 notas, valores reais entre zero e dez, para
        4 alunos e mostre a média de cada aluno.
         */

        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, media;
        int cont = 0, cont2 = 0;

        while(cont < 4){
            System.out.println("Olá, aluno "+ (cont+1) +"!");
            System.out.println("Notas devem ser entre 0 e 10!");

            System.out.println("Digite a primeira nota: ");
            nota1 = leitor.nextDouble();
            while(nota1<0 || nota1>10){
                System.out.println("Erro: nota invalida! Deve ser entre 0 e 10.");
                System.out.println("Digite a primeira nota novamente: ");
                nota1 = leitor.nextDouble();
            }

            System.out.println("Digite a segunda nota: ");
            nota2 = leitor.nextDouble();
            while(nota2<0 || nota2>10){
                System.out.println("Erro: nota invalida! Deve ser entre 0 e 10.");
                System.out.println("Digite a segunda nota novamente: ");
                nota2 = leitor.nextDouble();
            }

            media = (nota1 + nota2) / 2;

            System.out.println("A média do aluno "+ (cont+1) +" é: "+ media);

            cont++;
        }

    }
}
