package aula_0209;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        /* 12) Deseja-se construir um algoritmo para projetar futuramente um programa de
        auxílio a uma eleição. Os votos válidos são representados pelos números 1, 2 e
        3, cada um correspondendo a um candidato. O voto em branco é representado
        pelo número 0 e o voto nulo, pelo número –1. Esse algoritmo deverá processar
        N respostas da votação, e deverá calcular e exibir:
        a) o total de votos para cada candidato;
        b) o total de votos em branco;
        c) o total de votos nulos;
        d) o número do candidato vencedor (ou indicar se não houve vencedor,
        caso a população tenha anulado ou deixado em branco todos os votos). */

        Scanner leitor = new Scanner(System.in);

        int voto, cand1 = 0, cand2 = 0, cand3 = 0, branco = 0, nulo = 0, vencedor = 0, n = 0, cont = 0;

        System.out.println("Digite a quantidade de votos para a eleição: ");
        n = leitor.nextInt();

        while(n <= 0){
            System.out.println("Erro: quantidade inválida!");
            System.out.println("Digite a quantidade de votos novamente: ");
            n = leitor.nextInt();
        }

        while(cont < n){
            System.out.println("Digite o voto nº "+ (cont+1));
            voto = leitor.nextInt();
            while(voto < -1 || voto > 3){
                System.out.println("Erro: voto inválido!");
                System.out.println("Digite o voto nº "+ (cont+1) +" novamente:");
                voto = leitor.nextInt();
            }

            if (voto == 1){
                cand1+= 1;
            }
            else{
                if (voto == 2){
                    cand2+= 1;
                }
                else{
                    if (voto == 3){
                        cand3+= 1;
                    }
                    else{
                        if (voto == 0){
                            branco+= 1;
                        }
                        else {
                            if (voto == -1){
                                nulo+= 1;
                            }
                        }
                    }
                }
            }
            cont++;
        }

        System.out.println("Total de votos:");
        System.out.println("Candidato 1: "+ cand1 +"\nCandidato 2: "+ cand2 +"\nCandidato 3: "+cand3);
        System.out.println("Em branco: "+ branco +"\nNulo: "+nulo);

        vencedor = cand1;

        if(cand1 == 0 && cand2 == 0 && cand3 == 0){
            System.out.println("Não há vencedor! População votou em branco ou nulo.");
        }
        else{
            if(cand2 > vencedor &&  cand2 > cand3){
                vencedor = cand2;
                System.out.println("O vencedor é o candidato 2!");
            }
            else{
                if(cand3 > vencedor &&  cand3 > cand2){
                    vencedor = cand3;
                    System.out.println("O vencedor é o candidato 3!");
                }
                else{
                    if(vencedor == cand2 || vencedor == cand3 || cand2 == cand3){
                        System.out.println("Erro: houver empate!\nNão há um vencedor.");
                    }
                    else{
                        System.out.println("O vencedor é o candidato 1!");
                    }
                }
            }
        }

    }
}
