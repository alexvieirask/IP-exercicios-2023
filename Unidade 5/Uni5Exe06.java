/*
Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.
*/

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int altura, 
            somaAltura = 0,
            mediaAltura = 0;

        System.out.println("Altura em CM");
        for(int i = 1; i <= 20; i++){
            System.out.print("Pessoa ["+i+"]: ");
            altura = input.nextInt();

            somaAltura += altura;
        }

        mediaAltura = somaAltura / 20;
       
        System.out.println("Média das Alturas em CM:" + mediaAltura);
       
        input.close(); 
    }
}