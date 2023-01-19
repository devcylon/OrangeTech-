import java.util.Scanner;

public class RepetiçãoArrays {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String nome;
            int idade;

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
    }   
    
}
