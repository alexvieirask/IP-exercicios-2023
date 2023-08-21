import java.util.Scanner;
/*
Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, 
garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, 
faça um programa para calcular quantos litros de refrigerante ele comprou.
*/
public class Uni3Exe07 {
    public static void main(String[] args) throws Exception {
        final int canOfSodaValue = 350;
        final int smallBottleValue = 600;
        final int bigBottleValue = 2000;

        int quantityCanOfSoda, quantitySmallBottle,quantityBigBottle;

        double quantityTotalLiter;

        Scanner scannerQuantityCanOfSoda = new Scanner(System.in);
        Scanner scannerQuantitySmallBottle = new Scanner(System.in);
        Scanner scannerQuantityBigBottle = new Scanner(System.in);

        System.out.print("Write Can of Soda Quantity: ");
        quantityCanOfSoda = scannerQuantityCanOfSoda.nextInt();

        System.out.print("Write Small Bottle Quantity: ");
        quantitySmallBottle = scannerQuantitySmallBottle.nextInt();

        System.out.print("Write Big Bottle Quantity: ");
        quantityBigBottle = scannerQuantityBigBottle.nextInt();

        quantityTotalLiter = ((quantityCanOfSoda * canOfSodaValue) + 
                              (quantitySmallBottle * smallBottleValue) + 
                              (quantityBigBottle * bigBottleValue)) / 1000.0 ;

        System.out.println("Result Total Liters: "+ quantityTotalLiter);

        scannerQuantityCanOfSoda.close();
        scannerQuantitySmallBottle.close();
        scannerQuantityBigBottle.close();



    }
}
