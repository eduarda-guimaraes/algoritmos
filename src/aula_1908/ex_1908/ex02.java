package aula_1908.ex_1908;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        /* 2. Escreva um algoritmo em Java que a partir de 2 inteiros informados pelo usuário,
        identifique qual o maior valor entre eles e o exibe seguido das palavras “valor maior“.
        Caso os números sejam iguais, exiba a mensagem “valores iguais”. */
        Scanner leitor = new Scanner(System.in);

        int n1, n2;

        System.out.println("Qual valor é o maior entre os inteiros?\n");
        System.out.println("Digite o primeiro número inteiro: ");
        n1 = leitor.nextInt();
        System.out.println("\nDigite o segundo número inteiro: ");
        n2 = leitor.nextInt();

        if(n1 == n2)
            System.out.println("valores iguais");
        else{
            if(n1 > n2)
                System.out.println(n1 +" valor maior");
            else
                System.out.println(n2 +" valor maior");
        }
    }
}
