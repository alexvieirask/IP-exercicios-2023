/*
Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, 
o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de 
lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
*/

import java.util.Scanner;

public class Uni5Exe14{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int totalMercadorias = 20;

        int lucroMenor10 = 0,
            lucroEntre10e20 = 0,
            lucroMaior20 = 0;

        String nome;

        double precoCompra,
               precoVenda;
            
        double percentualLucro;

        double lucroTotal = 0,
               compraTotal = 0,
               vendaTotal = 0;

 
        for (int i = 1; i <= totalMercadorias; i++) {
            System.out.println("Mercadoria " + i + ":");
            System.out.print("Nome: ");
            nome = input.next();
            
            System.out.print("Preço de compra (PC): ");
            precoCompra = input.nextDouble();

            System.out.print("Preço de venda (PV): ");
            precoVenda = input.nextDouble();

            percentualLucro = ((precoVenda - precoCompra) / precoCompra) * 100;

            compraTotal += precoCompra;
            vendaTotal += precoVenda;
            lucroTotal += (precoVenda - precoCompra);

            if (percentualLucro < 10) {
                lucroMenor10++;
            } else if (percentualLucro <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }
        }

        System.out.println("Quantidade de mercadorias com lucro < 10%: " + lucroMenor10);
        System.out.println("Quantidade de mercadorias com 10% <= lucro <= 20%: " + lucroEntre10e20);
        System.out.println("Quantidade de mercadorias com lucro > 20%: " + lucroMaior20);

        System.out.println("Valor total de compra: " + compraTotal);
        System.out.println("Valor total de venda: " + vendaTotal);
        System.out.println("Lucro total: " + lucroTotal);

        input.close();
    }
}