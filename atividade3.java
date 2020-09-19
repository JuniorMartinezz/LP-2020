package atividade;

import java.util.Random;

public class atividade3 {
    public static void main (String []args){
        int sorteio = 0;
        int[] senha = new int[10];

        while(sorteio<5){
            sorteio = (int) (Math.random()*11);
        }

        System.out.println("Número sorteado foi: " +sorteio);
        
        for(int i = 0; i < sorteio; i++){
            System.out.print((int) (Math.random()*10));
        }
    }
}

