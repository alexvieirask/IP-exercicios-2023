import java.util.Scanner;
/*
Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) 
e imprima o valor a pagar. O peso do prato é de 750 gramas.
*/

public class Uni3Exe06 {
    public static void main(String[] args) throws Exception {
        final double priceKG = 25.0, plateWeight = 0.75;

        double plateWeightTotal;

        double resultPrice;

        Scanner scannerplateWeight = new Scanner(System.in);

        System.out.print("Escreva o peso (KG): ");
        plateWeightTotal = scannerplateWeight.nextDouble();

        resultPrice = priceKG * (plateWeightTotal - plateWeight ) ;

        System.out.println("Resultado do valor à pagar: "+ resultPrice);

       scannerplateWeight.close();
    }
}
