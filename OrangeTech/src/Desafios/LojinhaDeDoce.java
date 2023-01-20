package Desafios;

import java.util.Scanner;

public class LojinhaDeDoce {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        int quantidadeDoce = doce*2;
        
        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
      System.out.println("O cliente obteve " + quantidadeDoce+" doces");
    }
}
