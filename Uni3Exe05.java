import java.util.Scanner;
/*
No pé direito do frango há um anel com um chip de identificação; 
no pé esquerdo são dois anéis para  indicar o tipo de alimento que ele deve consumir. 

Sabendo que o anel com chip custa R$ 4,00 e o anel 
de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.
*/

public class Uni3Exe05 {
    public static void main(String[] args) throws Exception {
        final double ringChipValue = 4;
        final double ringFoodValue = 3.50;

        int quantityChicken;
        double totalCost;
        
        Scanner scannerQuantityChicken = new Scanner(System.in);

        System.out.print("Escreva a quantidade de frangos: ");
        quantityChicken = scannerQuantityChicken.nextInt();

        totalCost = (ringChipValue + (ringFoodValue * 2)) * quantityChicken;

        System.out.println("Custo total da granja: " + totalCost);
        scannerQuantityChicken.close();

    }
}
