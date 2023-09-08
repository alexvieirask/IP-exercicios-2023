import java.util.Scanner;
/*
Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o 
número mínimo de notas que o caixa deve fornecer como troco.
Escreva também o número de cada tipo de nota a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.
*/

public class Uni3Exe16 {
    public static void main(String[] args) throws Exception {
        final int dezReais = 10, cemReais = 100; 

        int valorCompra, valorEntregue, troco;

        int quantidadeUmReal, quantidadeDezReais,quantidadeCemReais;

        Scanner scannerValorCompra = new Scanner(System.in);
        Scanner scannerValorEntregue = new Scanner(System.in);

        System.out.print("Escreva o valor da compra: ");
        valorCompra = scannerValorCompra.nextInt();

        System.out.print("Escreva o valor entregue: ");
        valorEntregue = scannerValorEntregue.nextInt();

        troco = valorEntregue - valorCompra;

        quantidadeCemReais = troco / cemReais;
        troco %= cemReais;

        quantidadeDezReais = troco / dezReais;
        troco %= dezReais;

        quantidadeUmReal = troco;

        System.out.println("Valor de Troco: " + troco);

        System.out.println("Um Real: " + quantidadeUmReal);
        System.out.println("Dez Reais: " + quantidadeDezReais);
        System.out.println("Cem Reais: " + quantidadeCemReais);

        scannerValorCompra.close();
        scannerValorEntregue.close();
    }
}
