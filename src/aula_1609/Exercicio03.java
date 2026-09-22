package aula_1609;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /* 3) Uma escola de idiomas tem como critério de aprovação em um módulo que a
        média do aluno seja maior ou igual a 7,0. A média é calculada a partir da média
        aritmética das duas melhores notas de três notas recebidas durante o módulo.
        Assim, faça um programa em Java que calcule e exiba a porcentagem de alunos:
        - aprovados,
        - reprovados,
        a partir da leitura dos seguintes dados: quantidade de alunos no módulo e as três
        notas de cada aluno. Lembre-se de garantir que os dados lidos estejam adequados
        ao problema. */
        Scanner leitor = new Scanner(System.in);
        // média >= 7 pra passar (aprovados)
        double n1 = 0, n2 = 0, n3 = 0, media = 0, aprov = 0, reprov = 0, porcenApro, porcenRepro;
        int i = 0, quantAlunos;

        System.out.println("Digite a quantidade de alunos: ");
        quantAlunos = leitor.nextInt();
        while(quantAlunos <= 0){
            System.out.println("Erro: quantidade de alunos não existe!");
            System.out.println("Digite a quantidade de alunos novamente: ");
            quantAlunos = leitor.nextInt();
        }

        for(i=0; i<quantAlunos; i++){
            System.out.println("Aluno "+(i+1));
            System.out.println("========");
            do{
                System.out.println("Digite a primeira nota: ");
                n1 = leitor.nextDouble();
                if(n1<0 || n1 > 10){
                    System.out.println("Erro: nota inválida!");
                }
            }while(n1<0 || n1>10);
            do{
                System.out.println("Digite a segunda nota: ");
                n2 = leitor.nextDouble();
                if(n2<0 || n2 > 10){
                    System.out.println("Erro: nota inválida!");
                }
            }while(n2<0 || n2>10);
            do{
                System.out.println("Digite a terceira nota: ");
                n3 = leitor.nextDouble();
                if(n3<0 || n3 > 10){
                    System.out.println("Erro: nota inválida!");
                }
            }while(n3<0 || n3>10);
            media = (n1+n2+n3)/3;
            System.out.printf("Média do aluno %d: %.2f%n\n", i+1, media);
            if(media >= 7){
                aprov++;
            }
            else{
                reprov++;
            }
        }
        porcenApro = (aprov*100)/quantAlunos;
        porcenRepro = (reprov*100)/quantAlunos;

        System.out.printf("Porcentagem de Aprovados: %.2f%n%", porcenApro);
        System.out.printf("Porcentagem de Reprovados: %.2f%n%", porcenRepro);
    }
}
