package Desafios;

import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.
    if(velocidadeAtual > 60) System.out.println("Foi multado");
    else System.out.println("Nao foi multado");
    }
}
