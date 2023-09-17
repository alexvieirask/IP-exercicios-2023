/*
O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está 
no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, 
onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:

Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:

IMC	Classificação
< 18.5	Magreza
18.5 - 24.9	Saudável
25.0 - 29.9	Sobrepeso
30.0 - 34.9	Obesidade Grau I
35.0 - 39.9	Obesidade Grau II (severa)
>= 40.0	Obesidade Grau III (mórbida)
*/

import java.util.Scanner;

public class Uni4Exe21{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double massa, altura;
        
        double IMC; 
        String classificacao = "Magreza";

        System.out.print("Escreva a massa do indivíduo: ");
        massa = input.nextDouble();

        System.out.print("Escreva a altura do indivíduo: ");
        altura = input.nextDouble();

        IMC = massa  / (altura * altura);

        if (IMC >= 18.5 && IMC <= 24.9)
            classificacao = "Saudável";
        
        if (IMC >= 25.0 && IMC <= 29.9 )
            classificacao = "Sobrepeso";
        
        if (IMC >= 30.0 && IMC <= 34.9)
            classificacao = "Obesidade Grau I";
        
        if (IMC >= 35.0 && IMC <= 39.9)
            classificacao = "Obesidade Grau II (severa)";

        if (IMC >= 40.0)
            classificacao = "Obesidade Grau III (mórbida)";

        System.out.println("IMC: "+IMC);
        System.out.println("Classificação: "+classificacao);
        
        input.close();
    }
}
