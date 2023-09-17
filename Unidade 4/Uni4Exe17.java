/*
Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual 
e o número de dependentes do contribuinte. A renda líquida é calculada sobre a renda 
anual com um desconto de 2% para cada dependente do contribuinte. O contribuinte com 
uma renda líquida de até R$ 2.000,00 não paga imposto. Para aqueles que possuem renda 
líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; 
para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00 
pagam 15% de imposto.
*/

import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    
        int dependentes, porcentagemTotal;

        double rendaAnual, rendaLiquidaMensal; 

        double valorImposto = 0, porcentagemImposto; 

        System.out.print("Digite a renda anual: ");
        rendaAnual = input.nextDouble();

        System.out.print("Digite a quantidade de dependentes: ");
        dependentes = input.nextInt();

        porcentagemTotal = 2 * dependentes;
        rendaLiquidaMensal = (rendaAnual - ((rendaAnual / 100) * porcentagemTotal)) / 12;

        if (rendaLiquidaMensal <= 2000.00){
            porcentagemImposto = 0;
        } 
        else if (rendaLiquidaMensal > 2000.00 && rendaLiquidaMensal <= 5000.00){
            porcentagemImposto = 5.00;
        } 
        else if (rendaLiquidaMensal > 5000.00 && rendaLiquidaMensal <= 10000.00){
            porcentagemImposto = 10.00;
        }
        else{
            porcentagemImposto = 15.00;
        }
        
        valorImposto = (rendaLiquidaMensal / 100 ) * porcentagemImposto;

        System.out.println("Renda líquida mensal: "+ rendaLiquidaMensal);
        System.out.println("Imposto de renda a ser pago: "+valorImposto);

        input.close();
    }
}