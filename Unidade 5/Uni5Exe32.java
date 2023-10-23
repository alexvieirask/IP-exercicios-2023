/*
Escreva um programa que imprime um calendário para um determinado mês. O calendário deve conter cada dia do mês e o dia da semana correspondente. A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro especificando o número de dias que o mês possui.

Exemplo: p = 3 n = 31

D	S	T	Q	Q	S	S
1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31		
*/

import java.util.Scanner;

public class Uni5Exe32{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diaDaSemana,
            numeroDias,
            dia = 1;

        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        diaDaSemana = input.nextInt();

        System.out.print("Digite o número de dias no mês: ");
        numeroDias = input.nextInt();

        dia = 1;

        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                System.out.print("D\t");
            } 
            else if (i == 2) {
                System.out.print("S\t");
            } 
            else if (i == 3) {
                System.out.print("T\t");
            } 
            else if (i == 4) {
                System.out.print("Q\t");
            } 
            else if (i == 5) {
                System.out.print("Q\t");
            } 
            else if (i == 6) {
                System.out.print("S\t");
            } 
            else if (i == 7) {
                System.out.print("S\t");
            }
        }

        System.out.println();

        for (int i = 1; i < diaDaSemana; i++) {
            System.out.print("\t");
        }

        while (dia <= numeroDias) {
            System.out.print(dia + "\t");

            if (diaDaSemana == 7) {
                System.out.println();
                diaDaSemana = 0;
            }

            dia++;
            diaDaSemana++;
        }

        input.close();
    } 
}