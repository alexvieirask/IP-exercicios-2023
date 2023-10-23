/*
Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:

R$ 7,50 por diária, caso o número de diárias seja menor que 15;
R$ 6,50 por diária, caso o número de diárias seja igual a 15;
R$ 5,00 por diária, caso o número de diárias seja maior que 15.
Descreva um algoritmo que apresente as seguintes opções ao recepcionista:

(1) encerrar a conta de um hóspede;
(2) verificar número de contas encerradas;
(3) sair.
Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a ser pago. 
Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). 
Caso a opção escolhida seja a terceira finalize a execução do algoritmo.


*/

import java.util.Scanner;

public class Uni5Exe34{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao,
            contasEncerradas = 0,
            numeroDiarias;
        
        String nome;

        double totalAPagar = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    nome = input.next();

                    System.out.print("Digite o número de diárias: ");
                    numeroDiarias = input.nextInt();

                    double taxaServicos;

                    if (numeroDiarias < 15) {
                        taxaServicos = 7.50;
                    } else if (numeroDiarias == 15) {
                        taxaServicos = 6.50;
                    } else {
                        taxaServicos = 5.00;
                    }

                    totalAPagar = 50.00 * numeroDiarias + taxaServicos;

                    System.out.println("Nome do hóspede: " + nome);
                    System.out.println("Total a ser pago: R$ " + totalAPagar);
                    contasEncerradas++;
                    break;
                case 2:
                    System.out.println("Número de contas encerradas: " + contasEncerradas);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção incorreta. Digite um número válido.");
            }

        } while (opcao != 3);

        input.close();
    }
}