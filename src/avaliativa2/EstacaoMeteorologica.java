    // Nomes: Eduarda Guimarães, Raquel dos Santos Cezar
    // Número da dupla: 1

    package avaliativa2;

    import java.util.Scanner;

    public class EstacaoMeteorologica {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[] temperaturas = new double[7];
            int i, opcao;
            boolean todasIguais = true;


            // R1 e R2: ler valores e validar a faixa com o do-while
            for(i = 0; i < 7; i++){
                do{
                    System.out.println("Digite a temperatura do dia " + (i + 1) +
                            " (faixa de -10ºC a 45ºC): ");
                    temperaturas[i] = sc.nextDouble();

                    if(temperaturas[i] < -10 || temperaturas[i] > 45){
                        System.out.println("Erro: temperatura inválida!");
                    }
                }while(temperaturas[i] < -10 || temperaturas[i] > 45);
                if (temperaturas[i] != temperaturas[0]) {
                    todasIguais = false;
                }
            }

            // R3: menu para o usuário
            do {
                System.out.println("\n== Estação Meteorológica ==");
                System.out.println("1 - Listar temperaturas");
                System.out.println("2 - Soma e média");
                System.out.println("3 - Maior e menor temperatura");
                System.out.println("4 - Temperaturas acima da média");
                System.out.println("5 - Classificar temperaturas");
                System.out.println("6 - Maior sequência de temperaturas subindo");
                System.out.println("0 - Sair");
                System.out.print("Digite sua opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        // R4: listar
                        for (i = 0; i < 7; i++) {
                            System.out.println("------------------");
                            System.out.println("Posição: " + i);
                            System.out.println("Dia " + (i + 1) + ": "
                                    + temperaturas[i] + "ºC");
                        }
                        break;

                    case 2:
                        // R5: soma e média
                        double soma = 0;

                        for (i = 0; i < 7; i++) {
                            soma = soma + temperaturas[i];
                        }

                        double media = soma / 7.0;

                        System.out.println("Soma: " + soma);
                        System.out.printf("Média: %.2f", media);
                        break;

                    case 3:
                        // R6: maior e menor temperatura
                        double maior = temperaturas[0];
                        double menor = temperaturas[0];
                        int posMaior = 0;
                        int posMenor = 0;

                        for (i = 1; i < 7; i++) {
                            if (temperaturas[i] > maior) {
                                maior = temperaturas[i];
                                posMaior = i;
                            }

                            if (temperaturas[i] < menor) {
                                menor = temperaturas[i];
                                posMenor = i;
                            }
                        }

                        if(todasIguais){
                            System.out.println("Sem maior e menor :(\nNúmeros iguais!");
                            System.out.println("Todos são: "+maior+"ºC");
                        }
                        else{
                            System.out.println("Maior: " + maior
                                    + "ºC, dia " + (posMaior + 1) +", posição: "+ posMaior);
                            System.out.println("Menor: " + menor
                                    + "ºC, dia " + (posMenor + 1) +", posição: "+ posMenor);
                        }

                        break;

                    case 4:
                        // R7: temperaturas acima da média
                        double somaMedia = 0;

                        for (i = 0; i < 7; i++) {
                            somaMedia = somaMedia + temperaturas[i];
                        }

                        double mediaDias = somaMedia / 7.0;
                        int quantidade = 0;

                        for (i = 0; i < 7; i++) {
                            if (temperaturas[i] > mediaDias) {
                                System.out.println("Dia " + (i + 1) + ": "
                                        + temperaturas[i] + "Cº");
                                quantidade++;
                            }
                        }

                        System.out.println("Quantidade acima da média: "
                                + quantidade);
                        break;

                    case 5:
                        // R8: classificar temperaturas
                        for (i = 0; i < 7; i++) {
                            if (temperaturas[i] < 15) {
                                System.out.println("Dia " + (i + 1) + ": Frio");
                            } else if (temperaturas[i] <= 25) {
                                System.out.println("Dia " + (i + 1) + ": Agradável");
                            } else {
                                System.out.println("Dia " + (i + 1) + ": Quente");
                            }
                        }
                        break;


                    case 6:
                        // R9: maior sequência de temperaturas subindo
                        int sequencia = 1;
                        int maiorSequencia = 1;

                        for (i = 1; i < 7; i++) {
                            if (temperaturas[i] > temperaturas[i - 1]) {
                                sequencia++;

                                if (sequencia > maiorSequencia) {
                                    maiorSequencia = sequencia;
                                }
                            } else {
                                sequencia = 1;
                            }
                        }

                        if (todasIguais) {
                            System.out.println(
                                    "Não existe sequência de dias subindo! Números iguais.");
                        } else {
                            System.out.println(
                                    "Maior sequência de dias subindo: " + maiorSequencia);
                        }
                        break;

                    case 0:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } while (opcao != 0);

        }
    }
