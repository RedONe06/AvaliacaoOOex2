package br.ulbra.classes;

// @author Andriele Joras dos Santos - Noturno
// Início: 18/03/22 - 15:30 pm
// Final: 18/03/22 - 17:50 pm
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Pessoa pessoa = new Pessoa(0, 0);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua altura:");
        pessoa.setAltura(input.nextDouble());
        
        System.out.println("Digite seu peso:");
        pessoa.setPeso(input.nextDouble());
        
        System.out.println(pessoa.toString());
    }
}
