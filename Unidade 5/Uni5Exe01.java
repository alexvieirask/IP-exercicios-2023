/*
Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.
*/

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int number;

        for (int i = 1; i <= 20;i++){
            System.out.print("Escreva o número: ");
            number = input.nextInt();
            if (number % 2 == 0)
                System.out.println("O número é par.");
            else
                System.out.println("O número é ímpar.");
            
            System.out.println("----------------");
        }

        input.close();
    }
}
