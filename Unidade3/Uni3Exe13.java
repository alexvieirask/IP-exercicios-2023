import java.util.Scanner;
/*
Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
Faça um programa para ler o comprimento e altura de uma parede (em metros), e 
depois escrever o valor gasto com a compra de azulejos. Considere que um metro 
quadrado é formado por 9 azulejos.
*/

public class Uni3Exe13 {
    public static void main(String[] args) throws Exception {
        final double tileStampedPrice = 12.50;

        double lengthWall, heightWall;

        double spentWithTile;

        Scanner scannerLengthWall = new Scanner(System.in);
        Scanner scannerHeightWall = new Scanner(System.in);

        System.out.print("Escreva o comprimento da parede em metros: ");
        lengthWall = scannerLengthWall.nextDouble();

        System.out.print("Escreva a altura da parede em metros: ");
        heightWall = scannerHeightWall.nextDouble();

        spentWithTile = ((lengthWall * heightWall) * 9) * tileStampedPrice;

        System.out.println("Gasto com a compra de azulejos: "+ spentWithTile);
        
        scannerLengthWall.close();
        scannerHeightWall.close();

    }
}
