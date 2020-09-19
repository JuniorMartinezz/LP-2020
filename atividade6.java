package atividade;

import java.util.Scanner;

public class atividade6 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = input.next();

        System.out.println(palavra.substring(0, palavra.length()-1));
    }
}
