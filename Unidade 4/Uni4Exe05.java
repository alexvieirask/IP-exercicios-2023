/*
Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável 
lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, 
caso seja false.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String resposta;
        
        System.out.print("A cor é azul?");
        resposta = input.next();

        if (resposta.toUpperCase() =="SIM"){
            System.out.println("Sim");
        } 
        else{
           System.out.println("Não"); 
        }
        input.close();
    }
}
