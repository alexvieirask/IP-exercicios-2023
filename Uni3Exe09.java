import java.util.Scanner;

//Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
//normalsize&space;volume:=:\Pi::raio^2::altura

public class Uni3Exe09 {
    public static void main(String[] args) throws Exception {
        final double PI =  3.141592;

        double radius, height;
        double volume;
        
        Scanner scannerRadius = new Scanner(System.in);
        Scanner scannerHeight = new Scanner(System.in);

        System.out.print("Write radius: ");
        radius = scannerRadius.nextDouble();

        System.out.print("Write height: ");
        height = scannerHeight.nextDouble();

        volume = PI * Math.pow(radius,2) * height;

        System.out.println("Result volume: "+ volume);
        
        scannerRadius.close();
        scannerHeight.close();

    }
}
