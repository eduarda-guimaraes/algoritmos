package aula_0909;
import java.util.Scanner;


public class Exercicio01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;

            do {
                System.out.print("Digite N: ");
                n = sc.nextInt();

                if(n<=0)
                    System.out.println("Erro: N deve ser maior que zero!");
            }while(n <= 0);

            int contador = 1;
            while(contador <= n) {
                System.out.println(contador);
                contador++;
            }
        }
}
