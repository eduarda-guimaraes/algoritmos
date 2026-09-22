package aula_0209;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /* 9) Produza um algoritmo que possibilite a entrada de N valores de salários e exiba
        como resultado o salário médio calculado e o maior salário. Cuide para o seu
        algoritmo não aceitar valores inadequados para o problema. */

        Scanner leitor = new Scanner(System.in);

        double salMedio, maiorSal = 0, sal, soma = 0;
        int n = 0, cont = 0;

        System.out.println("Digite a quantidade de salários que deseja digitar: ");
        n = leitor.nextInt();
        while(n <= 0){
            System.out.println("Erro: quantidade de salários não existe!");
            System.out.println("Digite a quantidade de salários que deseja digitar: ");
            n = leitor.nextInt();
        }

        while(cont < n){
            System.out.println("Digite o salário "+ (cont+1));
            sal = leitor.nextDouble();
            if( cont == 0){
                maiorSal = sal;
            }
            else{
                if(sal > maiorSal){
                    maiorSal = sal;
                }
            }

            soma+=sal;
            cont++;
        }

        System.out.println("Salário maior: "+ maiorSal);
        System.out.println("Média salarial: "+ (soma/n));

    }
}
