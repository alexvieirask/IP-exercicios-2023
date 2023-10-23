/*
Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.
*/

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n;

        double numero,
               maior,
               menor;

        System.out.print("Informe a quantidade de números a serem lidos (n): ");
        n = input.nextInt();

        System.out.print("Informe o 1º número real: ");
        numero = input.nextDouble();
        maior = numero;
        menor = numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Informe o " + i + "º número real: ");
            numero = input.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        input.close();
    }
}