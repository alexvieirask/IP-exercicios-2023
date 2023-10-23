/*
Implemente o problema da mochila. Tendo-se uma sequência decrescente de números inteiros positivos que inicia em N, com decremento inteiro positivo K, deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro dela preferencialmente os maiores valores, até que ela esteja cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

os elementos a serem colocados na mochila;
os elementos que entraram na mochila;
os que ficaram fora da mochila;
qual é a soma dos elementos que entraram na mochila;
qual a soma dos elementos que não entraram na mochila.
*/

import java.util.Scanner;

public class Uni5Exe30{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N,
            K,
            M;

        int valorTotalNaMochila = 0,
            valorTotalForaDaMochila = 0;

        System.out.print("Digite o valor inicial (N): ");
        N = input.nextInt();

        System.out.print("Digite o valor do decremento (K): ");
        K = input.nextInt();

        System.out.print("Digite a capacidade da mochila (M): ");
        M = input.nextInt();

        System.out.println("Elementos a serem colocados na mochila:");
        
        while (N > 0 && M >= N) {
            System.out.print(N + " ");
            valorTotalNaMochila += N;
            M -= N;
            N -= K;
        }

        System.out.println();

        System.out.println("Elementos que entraram na mochila:");
        while (N > 0) {
            System.out.print(N + " ");
            valorTotalNaMochila += N;
            N -= K;
        }
        System.out.println();

        System.out.println("Elementos que ficaram fora da mochila:");
        while (N > 0) {
            System.out.print(N + " ");
            valorTotalForaDaMochila += N;
            N -= K;
        }
        System.out.println();

        System.out.println("Soma dos elementos que entraram na mochila: " + valorTotalNaMochila);
        System.out.println("Soma dos elementos que não entraram na mochila: " + valorTotalForaDaMochila);

        input.close();
    } 
}