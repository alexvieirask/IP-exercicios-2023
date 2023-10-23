/*
Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.
*/

import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int somaNumerosPares   = 0,
            somaNumerosImpares = 0;

        for (int i = 1; i <= 100;i++){
            if (i % 2 == 0)
                somaNumerosPares += i;
            else
                somaNumerosImpares += i;
        }

        System.out.println("x-- Soma --x");
        System.out.println("Números Pares: "+somaNumerosPares);
        System.out.println("Números Ímpares: "+somaNumerosImpares);

        input.close();
    }
}
