import java.util.Scanner;
/*
Descreva um programa que a partir da distância percorrida 
e o do tempo gasto por um motorista durante uma viagem de final de semana, 
calcule a velocidade média e a quantidade de combustível gasto na viagem, 
sabendo que o automóvel faz 12 km por litro.
*/

public class Uni3Exe14 {
    public static void main(String[] args) throws Exception {
        final double kmPerLiter = 12.0;

        double quantityHours, distance;
        
        double averageVelocity;

        Scanner scannerquantityHours = new Scanner(System.in);
        Scanner scannerDistance = new Scanner(System.in);

        System.out.print("Escreva a quantidade de horas: ");
        quantityHours = scannerquantityHours.nextDouble();

        System.out.print("Escreva a distancia percorrida em KM: ");
        distance = scannerDistance.nextDouble();

        averageVelocity = quantityHours / distance;

        System.out.println("Velocidade média: "+ averageVelocity);
        System.out.println("Quantidade de litros de gasolina gastos: "+ distance * kmPerLiter);
        
        scannerquantityHours.close();
        scannerDistance.close();

    }
}
