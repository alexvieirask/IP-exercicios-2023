/*
Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
*/

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int opcao;

        double numeroUm, numeroDois, numeroTres;

        double maiorNumero, menorNumero, meioNumero;

        System.out.print("Digite o primeiro número: ");
        numeroUm = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        numeroDois = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        numeroTres = input.nextDouble();

        System.out.println("------ ORDENAÇÃO ------");
        System.out.println("1 - Crescente");
        System.out.println("2 - Decrescente");
        System.out.println("3 - Maior Valor no Meio");

        System.out.print("Escreva o número da opção desejada: ");
        opcao = input.nextInt();

        // Ordenar os três números em ordem crescente
        if (numeroUm <= numeroDois && numeroUm <= numeroTres) {
            menorNumero = numeroUm;
            if (numeroDois <= numeroTres) {
                meioNumero = numeroDois;
                maiorNumero = numeroTres;
            } 
            else {
                meioNumero = numeroTres;
                maiorNumero = numeroDois;
            }
        } 
        else if (numeroDois <= numeroUm && numeroDois <= numeroTres) {
            menorNumero = numeroDois;
            if (numeroUm <= numeroTres) {
                meioNumero = numeroUm;
                maiorNumero = numeroTres;
            } 
            else {
                meioNumero = numeroTres;
                maiorNumero = numeroUm;
            }
        } 
        else {
            menorNumero = numeroTres;
            if (numeroUm <= numeroDois) {
                meioNumero = numeroUm;
                maiorNumero = numeroDois;
            } 
            else {
                meioNumero = numeroDois;
                maiorNumero = numeroUm;
            }
        }

        switch (opcao) {
            case 1:
                System.out.println(menorNumero + ", " + meioNumero + ", " + maiorNumero);
                break;

            case 2:
                System.out.println(maiorNumero + ", " + meioNumero + ", " + menorNumero);
                break;

            case 3:
                System.out.println(menorNumero + ", " + maiorNumero + ", " + meioNumero);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        input.close();
    }
}
