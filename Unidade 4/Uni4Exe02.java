/*
Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int valor;

        System.out.print("Escreva um valor inteiro maior do que zero: ");
        valor = input.nextInt();

        if (valor % 2 == 0){
            System.out.println("Número é par");
        }
        else{
            System.out.println("Número é impar");
        }
        input.close();
    }
}
