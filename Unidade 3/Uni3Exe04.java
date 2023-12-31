import java.util.Scanner;
/*
Faça um programa para ler três notas de um aluno em uma disciplina e 
imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
*/

public class Uni3Exe04 {
    public static void main(String[] args) throws Exception {
        final int pesoN1 = 5, pesoN2 = 3, pesoN3 = 2;

        double n1,n2,n3;

        double weightedAverage;

        Scanner scannerN1 = new Scanner(System.in);
        Scanner scannerN2 = new Scanner(System.in);
        Scanner scannerN3 = new Scanner(System.in);

        System.out.print("Escreva o valor da primeira nota: ");
        n1 = scannerN1.nextDouble();

        System.out.print("Escreva o valor da segunda nota: ");
        n2 = scannerN2.nextDouble();

        System.out.print("Escreva o valor da terceira nota: ");
        n3 = scannerN3.nextDouble();

        weightedAverage = (n1*pesoN1 + n2*pesoN2 + n3 *pesoN3);
        weightedAverage = weightedAverage  / (pesoN1 + pesoN2 + pesoN3);

        System.out.println("Resultado da média ponderada: " + weightedAverage);

        scannerN1.close();
        scannerN2.close();
        scannerN3.close();
    }
}
