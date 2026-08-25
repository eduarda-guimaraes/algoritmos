package aula_1908.ex_1908;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        /* 4. Proponha um algoritmo em Java para calcular a nota de um candidato em um
        concurso. Para isso, você deve ler as três notas do candidato entre 0 e 10. Em seguida,
        calcule a nota final dele no concurso, a qual corresponde à média ponderada,
        considerando que a primeira nota tem peso 2, a segunda tem peso 3 e a terceira tem
        peso 5. Exibir uma mensagem dizendo qual a média do aluno e se ele foi aprovado ou
        reprovado. A média para aprovação é 7. */
        Scanner leitor = new Scanner(System.in);

        double n1, n2, n3, mediaP;

        System.out.println("Cálculo da nota de um candidato no concurso!\n");
        System.out.println("Notas devem ser entre 0 e 10!\nDigite a primeira nota: ");
        n1 = leitor.nextDouble();
        System.out.println("Notas devem ser entre 0 e 10!\nDigite a segunda nota: ");
        n2 = leitor.nextDouble();
        System.out.println("Notas devem ser entre 0 e 10!\nDigite a terceira nota: ");
        n3 = leitor.nextDouble();

        if (n1 < 0 || n2 < 0 || n3 < 0 ||
            n1 > 10 || n2 > 10 || n3 > 10){
            System.out.println("Erro: notas devem estar entre os números 0 e 10!");
            leitor.close();
        }
        else{
            mediaP = (n1*2 + n2*3 + n3* 5) / 10;

            System.out.println("Média final do candidato: "+ mediaP);
            if (mediaP >= 7)
                System.out.println("Aprovada(o)!");
            else
                System.out.println("Reprovada(o) :(");
            leitor.close();
        }
    }




}
