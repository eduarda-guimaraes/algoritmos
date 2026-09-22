package aula_0209;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /* 3) Desenvolva um algoritmo que leia a idade de uma pessoa e a classifique
        conforme as seguintes faixas etárias: "Criança" para idades de 0 a 12 anos,
        "Adolescente" para idades entre 13 e 17 anos e "Adulto" para 18 anos ou mais. */

        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Você é criança, adolescente ou adulto?");
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();

        if(idade >= 0 && idade <= 12)
            System.out.println("Criança!");
        else {
            if(idade >= 13 && idade <= 17)
                System.out.println("Adolescente!");
            else
                System.out.println("Adulto!");
        }
    }
}
