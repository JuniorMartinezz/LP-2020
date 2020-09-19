package atividade;

import java.util.Scanner;

public class atividade2 {
    public static void main (String [] args){
        double valorProduto = 1;
        double acrescimo;
        double valorFinal;

        Scanner input = new Scanner(System.in);

        while(valorProduto != 0){
            System.out.println("Insira o valor do produto:");
            valorProduto = input.nextDouble();

            if(valorProduto == 0){
                break;
            }

            valorFinal = valorProduto*1.12;
            System.out.println("Valor final: R$"+Math.round(valorFinal));
        }

    }

}
