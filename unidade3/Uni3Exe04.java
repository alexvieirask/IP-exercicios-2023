/*
Faça um programa para ler três notas de um aluno em uma disciplina e 
imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
*/

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) throws Exception {
        final int pesoN1 = 5, pesoN2 = 3, pesoN3 = 2;

        double n1,n2,n3;

        double weightedAverage;

        Scanner scannerN1 = new Scanner(System.in);
        Scanner scannerN2 = new Scanner(System.in);
        Scanner scannerN3 = new Scanner(System.in);

        System.out.print("Write N1 value: ");
        n1 = scannerN1.nextDouble();

        System.out.print("Write N2 value: ");
        n2 = scannerN2.nextDouble();

        System.out.print("Write N3 value: ");
        n3 = scannerN3.nextDouble();

        weightedAverage = (n1*pesoN1 + n2*pesoN2 + n3 *pesoN3);
        weightedAverage = weightedAverage  / (pesoN1 + pesoN2 + pesoN3);

        System.out.println("Result Average: " + weightedAverage);

        scannerN1.close();
        scannerN2.close();
        scannerN3.close();
    }
}
