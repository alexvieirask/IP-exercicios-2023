import java.util.Scanner;
/*
Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
Fórmula:
*/

public class Uni3Exe10 {
    public static void main(String[] args) throws Exception {
        double catetoOne, catetoTwo;

        double hypotenuse; 

        Scanner scannercatetoOne = new Scanner(System.in);
        Scanner scannercatetoTwo = new Scanner(System.in);

        System.out.print("Escreva o valor do primeiro cateto: ");
        catetoOne = scannercatetoOne.nextDouble();

        System.out.print("Escreva o valor do segundo cateto: ");
        catetoTwo = scannercatetoTwo.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(catetoOne, 2) + Math.pow(catetoTwo, 2));

        System.out.println("Resultado da hipotenusa: "+ hypotenuse);

        scannercatetoOne.close();
        scannercatetoTwo.close();
    }
}
