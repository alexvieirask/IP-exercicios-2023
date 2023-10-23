/*
Uma loja de departamentos oferece para seus clientes um determinado 
desconto de acordo com o valor da compra efetuada. O desconto é de 20% caso 
o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que 
leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela 
loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra.
*/

import java.util.Scanner;

public class Uni5Exe19{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double valorCompra,
               totalRecebido = 0,
               desconto,
               totalPagar;

        while (true) {
            System.out.print("Informe o valor da compra (0 para encerrar): R$");
            valorCompra = input.nextDouble();

            if (valorCompra == 0) {
                break; 
            }

            if (valorCompra > 500.0) 
                desconto = 0.20;
            else 
                desconto = 0.15; 
            
            totalPagar = valorCompra * (1 - desconto);
            System.out.println("Total a pagar: R$" + totalPagar);

            totalRecebido += totalPagar;
        }

        System.out.println("Valor total recebido pela loja no final do dia: R$" + totalRecebido);

        input.close();
    }
}