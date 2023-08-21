import java.util.Scanner;


//Uma imobiliária vende apenas terrenos retangulares. 
//Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
public class Uni3Exe01 {
    public static void main(String[] args) throws Exception {
        double height, width;
        double area;

        Scanner scannerHeight = new Scanner(System.in);
        Scanner scannerWidth = new Scanner(System.in);
        
        System.out.print("Write height: ");
        height = scannerHeight.nextDouble();

        System.out.print("Write Width: ");
        width = scannerWidth.nextDouble();
        
        area = width * height;

        System.out.println("Area Result: " + area);

        scannerHeight.close();
        scannerWidth.close();
    }
}
