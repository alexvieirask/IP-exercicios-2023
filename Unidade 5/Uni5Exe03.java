/*
Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
*/

import java.util.Scanner;

public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double soma = 0.0;

        for (int i = 1; i <= 100; i++) {
            soma += 1.0 / i;
        }

        System.out.println("A soma da sequência até 100 termos é: " + soma);
        
        input.close();
    }
}
