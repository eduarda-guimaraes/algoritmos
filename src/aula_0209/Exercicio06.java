package aula_0209;

public class Exercicio06 {
    public static void main(String[] args) {
        /* 6) Desenvolva um programa que mostre na tela a soma dos números entre 1 e 10
        usando uma estrutura de iteração para realizar a soma. Atenção: o programa não
        receberá dados do usuário. */

        int cont = 1, soma = 0;

        System.out.println("Soma de números entre 1 e 10:");
        while(cont <= 10){
            soma+=cont;
            if(cont <= 9)
                System.out.printf(cont+ " + ");
            else
                System.out.printf("%d",cont);
            cont++;
        }

        System.out.println("\nA soma é: "+ soma);
    }
}
