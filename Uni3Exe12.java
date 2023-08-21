import java.util.Scanner;
/*
Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas 
trabalhadas mensais e o número de dependentes. A empresa paga R$ 10,00 por hora 
(valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) 
e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda.
 Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
*/

public class Uni3Exe12 {
    public static void main(String[] args) throws Exception {
        final double priceHour = 10.0, priceDependents = 60.0;
        
        final double percentINSS = 8.5, percentIR = 5;

        String name;
        double hoursWork, dependents;
        double grossSalary, netSalary;

        Scanner scannerHoursWork = new Scanner(System.in);
        Scanner scannerHoursPending = new Scanner(System.in);
        Scanner scannerName = new Scanner(System.in);

        System.out.print("Escreva o nome: ");
        name = scannerName.next();

        System.out.print("Escreva a quantidade de horas trabalhadas: ");
        hoursWork = scannerHoursWork.nextDouble();

        System.out.print("Escreva as dependentes: ");
        dependents = scannerHoursPending.nextDouble();

        grossSalary = (hoursWork * priceHour) + (dependents * priceDependents);
        netSalary = grossSalary - (((hoursWork * priceHour) / 100) * percentINSS) - (((hoursWork * priceHour) / 100) * percentIR)  ;

        System.out.println("Nome: "+ name);
        System.out.println("Salário Bruto: "+ grossSalary);
        System.out.println("Salário Líquido: "+ netSalary);


        scannerHoursWork.close();
        scannerHoursPending.close();
        scannerName.close();
    }
}
