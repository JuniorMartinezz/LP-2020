package atividade;

import java.util.Random;

public class atividade1 {
    public static void main (String [] args){
        int resultado = 0;

        for(int i = 0; i < 3; i++){
            int dado = (int) (Math.random()*6)+1;
            resultado += dado;
            System.out.println(dado);
        }
        System.out.println("A soma dos valores é: " + resultado);
    }
}