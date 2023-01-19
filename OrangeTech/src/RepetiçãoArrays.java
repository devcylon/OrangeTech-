import java.util.Random;
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
        // Tabuada
        int numero;
        System.out.println("Digite o número para gerar tabuada: ");
        numero = scan.nextInt();
        for(int x = 1; x < 11; x++)
            System.out.println(numero +" X " + x +" = "+ numero*x);
        
        // fatorial
        int multiplicacao = 1;
        System.out.println("Fatorial:");
        int fatorial = scan.nextInt();
        System.out.print(fatorial+"! =");
        for(int i =fatorial;i >= 1; i--){
            multiplicacao = multiplicacao * i;   
        }
        System.out.println(multiplicacao);
    
    // vetor
        int[] vetor ={-5, -6, 15, 50, 8, 4};
        for(int i = 5; i >= 0; i--){
            System.out.print(vetor[i] +", ");

        }
        
        // Array Consoante
        String[] consoantes= new String[6];
        int quantidadeConsoantes= 0;
        int count = 0;
        do{
            System.out.println("digite uma letra:");
            String letra= scan.next();
            if(!(letra.equalsIgnoreCase("a")|
            letra.equalsIgnoreCase("e")|
            letra.equalsIgnoreCase("i")|
            letra.equalsIgnoreCase("o")|
            letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeConsoantes++;
                count++;

            }
        }while(count < (consoantes.length)-1);
        for( String consoante : consoantes){
            if(consoante!=null)
            System.out.print(consoante + " ");
        }
        System.out.print(consoantes.length);
        */
        //números aleatórios

        Random random = new Random();
        int[] numerosAleatorios = new int[20];
        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        for (int numero  : numerosAleatorios) {
        System.out.print(numero + " "); 
        }
        System.out.println(" ");
        for (int numero  : numerosAleatorios) {
            System.out.print((numero+1) + " ");
                
            }

    } 


    
}
