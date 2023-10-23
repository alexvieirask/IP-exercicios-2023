/*
Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
8, 10, 16, 18, 32, 34, 64.
*/

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero = 8,
            n;

        System.out.print("Escreva a quantidade de termos: ");
        n = input.nextInt();

        if (n > 2){
            for (int i = 1; i <= n; i++) {
                System.out.print(numero);
                if (i % 2 == 0) {
                    numero =  (numero - 2)  * 2;
                } 
                else {
                    numero = numero + 2; 
                }

                if (i < n) {
                    System.out.print(", ");
                }   
            }
        } else{
            System.out.println("O valor n deve ser lido e deve ser maior do que 2.");
        }  
        input.close(); 
    }
}