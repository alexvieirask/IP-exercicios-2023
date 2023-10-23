/*
Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de 
cédulas que ele precisará combinar para entregar o valor solicitado. Por exemplo: se o valor for 6, então ele fornecerá uma
cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.
*/

import java.util.Scanner;

public class Uni5Exe29{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int valor;

        int cedula20 = 0,
            cedula10 = 0,
            cedula5 = 0,
            cedula2 = 0,
            cedula1 = 0;
        
        System.out.print("Digite o valor desejado: ");
        valor = input.nextInt();
        
        while (valor >= 20) {
            valor -= 20;
            cedula20++;
        }

        while (valor >= 10) {
            valor -= 10;
            cedula10++;
        }

        while (valor >= 5) {
            valor -= 5;
            cedula5++;
        }
        
        while (valor >= 2) {
            valor -= 2;
            cedula2++;
        }

        while (valor >= 1) {
            valor -= 1;
            cedula1++;
        }
        
        System.out.println("Cédulas de 20: " + cedula20);
        System.out.println("Cédulas de 10: " + cedula10);
        System.out.println("Cédulas de 5: " + cedula5);
        System.out.println("Cédulas de 2: " + cedula2);
        System.out.println("Cédulas de 1: " + cedula1);
        
        input.close();
    }
}