    package aula_0909;

    import java.util.Scanner;

    public class Exercicio05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String senha;

            do {
                System.out.print("Digite a senha: ");
                senha = sc.next();
                if (!senha.equals("java123")) {
                    System.out.println("Senha incorreta, tente novamente.");
                }
            } while (!senha.equals("java123"));

            System.out.println("Acesso liberado!");
        }
    }
