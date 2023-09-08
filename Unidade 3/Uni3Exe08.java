import java.util.Scanner;
/*
Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais o 
atendente deve devolver para a pessoa.
*/

public class Uni3Exe08 {
    public static void main(String[] args) throws Exception {
        final double dollarExchangeRate = 4.75;
        
        double dollarValue;

        double returnsInReal;

        Scanner scannerDollarValue = new Scanner(System.in);

        System.out.print("Escreva a quantia em dollar: ");
        dollarValue = scannerDollarValue.nextDouble();

        returnsInReal = dollarValue * dollarExchangeRate;
    
        System.out.println("Resultado da conversão para Real(R$): "+ returnsInReal);
        
        scannerDollarValue.close();
    }
}
