package teste;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int contPar = 0;
        int soma = 0;

        do{
            System.out.println("Informe o número: ");
            n = sc.nextInt();
            if(n<1)
                System.out.println("Número inválido!");
        }while(n<1);

        for(int i=1; i<=n; i++){
            if(i%2==0){
                contPar++;
            }else{
                soma=soma+i;
            }
            System.out.println(i+" - "+soma);
        }

        int qntd = 0;
        int somaImN = 0;
        int j = 1;
        while(j<=n){
            if(j%2!=0){
                somaImN = somaImN+j;
                qntd = qntd+1;
            }
            j++;
        }

        System.out.println("Pares: "+ contPar +" | Soma dos ímpares: "+soma);
        System.out.println("Média dos ímpares de n: "+(somaImN/qntd));
    }
}
