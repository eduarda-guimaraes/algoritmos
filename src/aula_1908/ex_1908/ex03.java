package aula_1908.ex_1908;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        /* 3. Escreva um algoritmo em Java que leia 3 números inteiros diferentes, e depois
        apresente a soma, o produto, o menor e o maior desses números. */
        Scanner leitor = new Scanner(System.in);

        int n1, n2, n3, soma, produto, maior, menor;

        System.out.println("Vamos descobrir a soma, o produto, o maior e o menor número entre 3 números inteiros?\n");
        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = leitor.nextInt();

        soma = n1+n2+n3;
        produto = n1*n2*n3;

        if (n1 > n2 && n1 > n3)
            maior = n1;
        else{
            if (n2 > n1 && n2 > n3)
                maior = n2;
            else
                maior = n3;
        }

        if (n1 < n2 && n1 < n3)
            menor = n1;
        else{
            if (n2 < n1 && n2 < n3)
                menor = n2;
            else
                menor = n3;
        }

        System.out.println("Soma dos três números: " + soma + "\nProduto dos três números: "+ produto);
        System.out.println("O maior número entre eles é: "+ maior);
        System.out.println("O menor número entre eles é: "+ menor);

    }
}
