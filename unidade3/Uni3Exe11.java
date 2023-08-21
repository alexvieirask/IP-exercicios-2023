/*
Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
°F = (9/5) °C + 32
*/

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) throws Exception {
        double temperatureInC;

        double temperaturaInF;

        Scanner scannertemperatureInC = new Scanner(System.in);

        System.out.print("Write temperature in Cº: ");
        temperatureInC = scannertemperatureInC.nextDouble();

        temperaturaInF = (temperatureInC * 9/5) + 32;

        System.out.println("Temperature in Fº: "+ temperaturaInF);

        scannertemperatureInC.close();
    }
}
