package atividade;

import java.util.Scanner;

public class atividade5 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        String frase;

        System.out.println("Digite uma frase:");
        frase = input.nextLine();
        frase = frase.toLowerCase();

        Boolean improprio1 = frase.contains ("sexo");
        Boolean improprio2 = frase.contains ("sexual");

        if(improprio1 == true || improprio2 || true){
            System.out.println("Conteúdo bloqueado!");
        }else{
            System.out.println("Conteúdo desbloqueado");
        }
        
    }
}
