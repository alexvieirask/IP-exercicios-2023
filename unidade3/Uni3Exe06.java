/*
Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) 
e imprima o valor a pagar. O peso do prato é de 750 gramas.
*/

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) throws Exception {
        final double priceKG = 25.0, plateWeightClient = 750.0;

        double plateWeight;

        double resultPrice;

        Scanner scannerplateWeight = new Scanner(System.in);

        System.out.print("Write plate Weight(KG): ");
        plateWeight = scannerplateWeight.nextDouble();

        resultPrice = priceKG * plateWeight ;

        System.out.println("Result Price: "+ resultPrice);

       scannerplateWeight.close();
    }
}
