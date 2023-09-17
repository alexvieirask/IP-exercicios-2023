/*
Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.
*/

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numeroUm, numeroDois, maiorNumero;

        System.out.print("Escreva o primeiro número: ");
        numeroUm = input.nextInt();

        System.out.print("Escreva o segundo número: ");
        numeroDois = input.nextInt();

        if(numeroUm > numeroDois){
            maiorNumero = numeroUm;
        }
        else{
            maiorNumero = numeroDois;
        }

        System.out.println("O maior número é: "+maiorNumero);

        input.close();
    }
}
