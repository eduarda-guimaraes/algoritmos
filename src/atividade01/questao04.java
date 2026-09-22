package atividade01;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double total;
        int formaPaga;

        System.out.println("Digite o valor total da compra: ");
        total = leitor.nextDouble();
        System.out.println("Digite a forma de pagamento conforme as opções: ");
        System.out.println("1 = à vista \n2 = cartão de crédito \n3 = boleto");
        formaPaga = leitor.nextInt();

        switch (formaPaga){
            case 1:
                total = total - (total*0.10);
                System.out.printf("O valor final da compra é: %.2f%n", total);
                break;
            case 2:
                total = total - (total*0.05);
                System.out.printf("O valor final da compra é: %.2f%n", total);
                break;
            case 3:
                System.out.printf("O valor final da compra é: %.2f%n", total);
                break;
            default:
                System.out.println("Forma de pagamento inválida");
        }

        leitor.close();
    }
}
