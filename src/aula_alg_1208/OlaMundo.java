package aula_alg_1208;


// importação da classe pra leitura
import java.util.Scanner;

public class OlaMundo {
	public static void main(String args[]) {
		System.out.println("Internacional é o melhor!");
		
		// criando um scanner
		Scanner leitor = new Scanner(System.in);
		
		double n1, n2, d;
		
		System.out.println("Digite dois números");
		n1 = leitor.nextDouble();		
		n2 = leitor.nextDouble();
		
		d = n1/n2;
		
		System.out.println("Divisão = "+ d);
		
	}
}
