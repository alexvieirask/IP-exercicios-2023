import java.util.Scanner;

// Um motorista deseja abastecer seu tanque de combustível. 
//Escreva um programa para ler o preço do litro da gasolina e o
// valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
public class Uni3Exe03 {
    public static void main(String[] args) throws Exception {
        double gasolinePrice, payValue; 
        double result;
        
        Scanner scannerGasolinePrice = new Scanner(System.in);
        Scanner scannerPayValue= new Scanner(System.in);
        
        System.out.print("Write Gasoline Price: ");
        gasolinePrice = scannerGasolinePrice.nextDouble();

        System.out.print("Write Pay Value: ");
        payValue = scannerPayValue.nextDouble();

        result = payValue / gasolinePrice;

        System.out.println("Result: " + result  );

        scannerGasolinePrice.close();
        scannerPayValue.close();

    }
}
