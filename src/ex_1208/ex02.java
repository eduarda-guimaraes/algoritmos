package ex_1208;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		/* 2. Escreva um algoritmo em Java que peça ao usuário que digite 2 números, obtenha esses
		números e exiba a soma, o produto, e a diferença. */
		
		Scanner leitor = new Scanner(System.in);
		double n1, n2, soma, produto, diferenca;
		
		System.out.println("Vamos descobrir a soma, produto e diferença de dois números?");
		System.out.println("============================================================");
		System.out.println("Digite o primeiro número: ");
		n1 = leitor.nextDouble();
		System.out.println("Digite o segundo número: ");
		n2 = leitor.nextDouble();
		
		soma = n1 + n2;
		produto = n1 * n2;
		diferenca = n1 - n2;
		
		System.out.println("Soma: "+ soma +"\nProduto: "+ produto +"\nDiferença: "+ diferenca);
		
	}
}
