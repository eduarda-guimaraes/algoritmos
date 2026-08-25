package aula_1908.ex_1908;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        /* 5. Elabore um algoritmo em Java que, uma vez que o usuário informe a idade em anos
        de um atleta, o programa o classifique em uma das categorias a seguir dos jogos da
        primavera:
        Infantil A = 6 a 8 anos
        Infantil B = 9 a 12 anos
        Juvenil A = 13 a 14 anos
        Juvenil B = 15 a 18 anos
        Pessoas com menos de 6 anos ou maiores de 18 anos não podem participar da competição. */
        Scanner leitor = new Scanner(System.in);

        int idade;

        System.out.println("Qual categoria o atleta se classifica?");
        System.out.println("Digite a idade do atleta: ");
        idade = leitor.nextInt();

        if (idade >= 6 && idade <= 8)
            System.out.println("A categoria do atleta é: Infantil A");
        else{
            if (idade >= 9 && idade <= 12)
                System.out.println("A categoria do atleta é: Infantil B");
            else{
                if (idade == 13 || idade == 14)
                    System.out.println("A categoria do atleta é: Juvenil A");
                else{
                    if(idade >= 15 && idade <= 18)
                        System.out.println("A categoria do atleta é: Juvenil B");
                    else
                        System.out.println("Pessoa não tem a idade de participação da competição!");
                }
            }
        }

    }
}
