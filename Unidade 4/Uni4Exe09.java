/*
Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
*/

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numeroUm, numeroDois;

        System.out.print("Digite o primeiro número: ");
        numeroUm = input.nextInt();

        System.out.print("Digite o segundo número: ");
        numeroDois = input.nextInt();

        if (numeroUm % numeroDois == 0){
            System.out.println("O número "+numeroUm+" é múltiplo de "+numeroDois);
        } 
        else{
            System.out.println("O número "+numeroUm+" não é múltiplo de "+numeroDois);
        }
        
        input.close();
    }
}
