package atividade01;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double peso, distancia, frete;
        char fiel;

        System.out.println("Digite o peso (kg): ");
        peso = leitor.nextDouble();

        System.out.println("Digite a distância (km): ");
        distancia = leitor.nextDouble();

        System.out.println("Você é um cliente fidelidade? Responda com (S/N): ");
        fiel = leitor.next().charAt(0);

        if (peso > 50 || distancia > 300) {
            frete = 25 + (0.80 * distancia);
        } else {
            frete = 15 + (0.50 * distancia);
        }

        if (fiel == 'S') {
            frete = frete - (frete * 0.10);
        }

        System.out.printf("O frete é: R$ %.2f%n", frete);
    }
}