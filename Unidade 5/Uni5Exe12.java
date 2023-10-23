/*
Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd:
*/

import java.util.Scanner;

public class Uni5Exe12{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n,
        numero = 1;
        
        System.out.print("Informe um número inteiro positivo n: ");
        n = input.nextInt();
        
        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }

        input.close();
    }
}