package ex_1208;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		// 1. Escreva um algoritmo em Java que leia um número e imprima o seu quadrado.
		Scanner leitor = new Scanner(System.in);
		int n1, quadrado;
		
		System.out.println("Digite um número inteiro para descobrir seu quadrado:");
		n1 = leitor.nextInt();
		
		quadrado=n1*n1;
		
		System.out.println("O quadrado de "+ n1 +" é: "+quadrado);
		
	}
}
