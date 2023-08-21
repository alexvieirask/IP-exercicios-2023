import java.util.Scanner;
/*
Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)  
*/

public class Uni3Exe15 {
    public static void main(String[] args) throws Exception {
        int number;
        final int centena = 100, dezena= 10, unidade = 10;

        int quantityCentena, quantityDezena, quantityUnidade;

        Scanner scannerNumber = new Scanner(System.in);

        System.out.print("Escreva o número: ");
        number = scannerNumber.nextInt();

        quantityCentena = number / centena;
        quantityDezena = (number / dezena) % dezena;
        quantityUnidade = number % unidade;

        System.out.println(quantityCentena + " centena(s) "+ quantityDezena + " dezena(s) " + quantityUnidade+ " unidade(s)" );

        scannerNumber.close();
    }
}
