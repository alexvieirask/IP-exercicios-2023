/*
Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, 
descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. 
Escreva a massa inicial, a massa final e o tempo.
*/

import java.util.Scanner;

public class Uni5Exe20{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double massaInicialKg,
               massaFinalKg = 0.0005,
               massafinal;
        
        int tempoSegundos = 0;

        System.out.print("Informe a massa inicial em quilogramas: ");
        massaInicialKg = input.nextDouble();
        
        massafinal = massaInicialKg;

        while (massafinal > massaFinalKg) {
            massafinal /= 2;
            tempoSegundos += 50;
        }

        System.out.println("Massa inicial: " + massaInicialKg + " Kg");
        System.out.println("Massa final: " + massaFinalKg + " Kg");
        System.out.println("Tempo necessário: " + tempoSegundos + " segundos");

        input.close();
    }
}