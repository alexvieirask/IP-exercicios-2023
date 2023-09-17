/*
Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, o 
cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o
 vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. 
 Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, 
 exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar 
 no mês seguinte.
*/

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int 
            diaVencimento,
            diaPagamento;

        double  
            valorPrestacao,
            valorAPagar = 0.0,
            multa;

        int 
            diasAtraso;

        System.out.print("Digite o dia do vencimento: ");
        diaVencimento = input.nextInt();

        System.out.print("Digite o dia do pagamento: ");
        diaPagamento = input.nextInt();

        System.out.print("Digite o valor da prestação: ");
        valorPrestacao = input.nextDouble();

        if (diaPagamento <= diaVencimento) {
            valorAPagar = valorPrestacao - ((valorPrestacao / 100) * 10);
            
            System.out.println("Pagamento está em dia!");
        } 
        else if (diaPagamento <= diaVencimento + 5) {
            valorAPagar = valorPrestacao; 

            System.out.println("Pagamento até 5 dias após o vencimento. O Cliente perdeu o desconto.");
        } 
        else {
            diasAtraso = diaPagamento - diaVencimento - 5;
            
            multa = (valorPrestacao / 100) * 2 * diasAtraso;
            
            valorAPagar = valorPrestacao + multa;

            System.out.println("Pagamento com atraso de " + diasAtraso + " dia(s)");
        }

        System.out.println("Valor a Pagar: "+ valorAPagar);
        input.close();
    }
}
