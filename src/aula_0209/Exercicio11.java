package aula_0209;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        /* 11) Em um campeonato de jogos online, é oferecida uma premiação de 100 mil reais
        para o primeiro colocado, e uma premiação de 50 mil reais para o segundo
        colocado. Assim, proponha programa, que lê a pontuação de três jogadores,
        identifica o primeiro e segundo colocado, e informa ao usuário a pontuação do
        primeiro e segundo colocado junto da premiação a ser recebida. Por exemplo:
        Jogador com 1500 pontos – primeiro colocado – 100 mil reais
        Jogador com 1200 pontos – segundo colocado – 50 mil reais
         Seu algoritmo não deve aceitar:
        - valores negativos de pontuação
        - valores iguais de pontuação entre os três jogadores */

        Scanner leitor = new Scanner(System.in);
        double jog1 = 0, jog2 = 0, jog3 = 0, primeiroCol = 0, segundoCol = 0;

        System.out.println("Campeonato de jogos Online");
        System.out.println("==========================\n");

        System.out.println("Digite a pontução do jogador 1: ");
        jog1 = leitor.nextDouble();
        while(jog1 < 0 ){
            System.out.println("Erro: número negativo!");
            System.out.println("Digite a pontuação novamente: ");
            jog1 = leitor.nextDouble();
        }

        System.out.println("Digite a pontução do jogador 2: ");
        jog2 = leitor.nextDouble();
        while(jog2 < 0 || jog2 == jog1){
            if(jog2 < 0){
                System.out.println("Erro: número negativo!");
                System.out.println("Digite a pontuação novamente: ");
                jog2 = leitor.nextDouble();
            }
            else{
                System.out.println("Erro: números iguais!");
                System.out.println("Digite a pontuação novamente: ");
                jog2 = leitor.nextDouble();
            }
        }

        System.out.println("Digite a pontução do jogador 3: ");
        jog3 = leitor.nextDouble();
        while(jog3 < 0 || jog3 == jog1 || jog3 == jog2){
            if(jog3 < 0){
                System.out.println("Erro: número negativo!");
                System.out.println("Digite a pontuação novamente: ");
                jog3 = leitor.nextDouble();
            }
            else{
                System.out.println("Erro: números iguais!");
                System.out.println("Digite a pontuação novamente: ");
                jog3 = leitor.nextDouble();
            }
        }

        primeiroCol = jog1;
        segundoCol = jog1;

        if (jog2 > primeiroCol) {
            primeiroCol = jog2;
        }
        else {
            if (jog3 > primeiroCol) {
                primeiroCol = jog3;
            }
        }

        if (primeiroCol == jog1) {
            if (jog2 > jog3) {
                segundoCol = jog2;
            }
            else {
                segundoCol = jog3;
            }
        }
        else {
            if (primeiroCol == jog2) {
                if (jog1 > jog3) {
                    segundoCol = jog1;
                }
                else {
                    segundoCol = jog3;
                }
            }
            else {
                if (jog1 > jog2) {
                    segundoCol = jog1;
                }
                else {
                    segundoCol = jog2;
                }
            }
        }

        System.out.println("Jogador com "+ primeiroCol +" pontos – primeiro colocado – 100 mil reais");
        System.out.println("Jogador com "+ segundoCol +" pontos – segundo colocado – 50 mil reais");
    }
}
