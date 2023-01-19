import java.util.Scanner;

public class RepetiçãoArrays {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String nome;
            int idade;
            /*
            while(true){
                System.out.println("Nome:");
                nome = scan.next();
                if(nome.equals("0")) break;
                System.out.println("Idade:");
                idade = scan.nextInt();
            }
            int nota; 
            nota=scan.nextInt();   
            while(nota < 0 | nota > 10){
            System.out.println("Nota inválida digite novamente!");
            nota = scan.nextInt();
            }
            System.out.println("Sua nota foi: " + nota);

            // do while
            int numero;
            int maior = 0;
            int count = 0;
            double soma= 0;
            do{
                System.out.println("Número");
                numero = scan.nextInt();
                if(numero > maior)maior = numero;
                count++;
                System.out.println("Maior:"+ maior);
                soma = (soma + numero);
                System.out.println("Média atual: "+ soma /count);
            }while(count<5);
            

            // Par e Ímpar

            int quantidadeNumero;
            System.out.println("Digite a quantidade de números: ");
            quantidadeNumero = scan.nextInt();
            int count = 0;
            int numero;
            int quantidadePares = 0;
            int quantidadeIpares = 0;

            do{
                System.out.println("Número: ");
                numero = scan.nextInt();
                if(numero % 2 == 0) quantidadePares++;
                else quantidadeIpares++;
                count++;
            }while(count < quantidadeNumero);
            System.out.println("Quantidade de pares: " + quantidadePares);
            System.out.println("Quantidade de Ímpares: " + quantidadeIpares);
        */
        int numero;
        System.out.println("Digite o número para gerar tabuada: ");
        numero = scan.nextInt();
        for(int x = 1; x < 11; x++)
            System.out.println(numero +" X " + x +" = "+ numero*x);
        }  

    
}
