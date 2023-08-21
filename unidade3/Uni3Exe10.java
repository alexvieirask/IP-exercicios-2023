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

        System.out.print("Write cateto one value: ");
        catetoOne = scannercatetoOne.nextDouble();

        System.out.print("Write cateto two value: ");
        catetoTwo = scannercatetoTwo.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(catetoOne, 2) + Math.pow(catetoTwo, 2));

        System.out.println("Result hypotenuse: "+ hypotenuse);

        scannercatetoOne.close();
        scannercatetoTwo.close();
    }
}
