/*
Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

escreva o menor valor negativo;
escreva a média dos números positivos.
*/

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n;
        int menorNegativo = 0,
            somaPositivos = 0,
            countPositivos = 0;
        double mediaPositivos = 0;
    
        System.out.print("Informe a quantidade de números inteiros a serem lidos (n): ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Informe o " + i + "º número inteiro: ");
            int numero = input.nextInt();

            if (numero < 0 && numero < menorNegativo) {
                menorNegativo = numero;
            }

            if (numero > 0) {
                somaPositivos += numero;
                countPositivos++;
            }
        }

        if (menorNegativo != 0) 
            System.out.println("O menor valor negativo é: " + menorNegativo);  
        else
            System.out.println("Não foram informados números positivos.");
        
        if (countPositivos > 0) {
            mediaPositivos =  somaPositivos / countPositivos;
            System.out.println("A média dos números positivos é: " + mediaPositivos);
        } else
            System.out.println("Não foram informados números positivos.");
        
        input.close();
    }
}