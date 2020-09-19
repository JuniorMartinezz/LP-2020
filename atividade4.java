package atividade;

import java.util.Scanner;

public class atividade4 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String frase;

        System.out.println("Digite a frase: ");
        frase = input.nextLine();    
        frase = frase.trim();

        for(int i = frase.length()-1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
}
