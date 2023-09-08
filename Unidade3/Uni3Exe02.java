import java.util.Scanner;
/*
Uma loja de calçados está concedendo 12% de desconto nos produtos. 
Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e 
quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. 
Como resultado, o programa deverá exibir as seguintes mensagens:

O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx
*/

public class Uni3Exe02 {
    public static void main(String[] args) throws Exception {
        final double discountPercent = 12.0;
        double shoesPrice;

        double shoesWithdiscount, shoesDiscount;

        Scanner scannerShoesPrice = new Scanner(System.in);
        
        System.out.print("Escreva o preço do par de sapatos: ");
        shoesPrice = scannerShoesPrice.nextDouble();

        shoesDiscount = (shoesPrice / 100) * discountPercent;
        shoesWithdiscount = shoesPrice - shoesDiscount;

        System.out.println("O valor do desconto é de R$ " + shoesDiscount);
        System.out.println("O preço do par de sapatos com desconto é R$ " + shoesWithdiscount);

        scannerShoesPrice.close();

    }
}
