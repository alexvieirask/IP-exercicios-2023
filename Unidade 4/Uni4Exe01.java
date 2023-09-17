/*
A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, 
cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
o valor por hora e escreva o salário total do funcionário, que deverá 
ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float horasMes, horasValor, salarioTotal, salarioExtra;

        System.out.print("Entre com as horas trabalhadas no mês: ");
        horasMes = input.nextFloat();

        System.out.print("Entre com o valor pago por hora: ");
        horasValor = input.nextFloat();

        salarioTotal = horasMes * horasValor;

        if (horasMes > 160){
            salarioExtra = (horasMes - 160) *(horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é: " + salarioTotal);

        input.close();
    }
}
