/*
Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.
*/

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double numero;

        System.out.print("Digite o número: ");
        numero = input.nextDouble();

        if (numero % 2 != 0.00){
            System.out.println("O número que você digitou possuí casas decimais informadas.");
        } 
        else{
            System.out.println("O número que você digitou não possuí casas decimais informadas.");
        }

        input.close();
    }
}
