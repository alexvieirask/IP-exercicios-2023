/*
Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.
*/

import java.util.Scanner;

public class Uni5Exe17{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numeroInscricao,
            numeroMaisAlto = 0,
            numeroMaisBaixo = 0,
            totalAtletas = 0;

      
        double altura,
               alturaMaisAlta = 0,
               alturaMaisBaixa = 0,
               somaAlturas = 0,
               alturaMedia = 0;
     
        while (true) {
            System.out.print("Informe o número de inscrição (0 para encerrar): ");
            numeroInscricao = input.nextInt();

            if (numeroInscricao == 0) {
                break; 
            }

            System.out.print("Informe a altura do atleta: ");
            altura = input.nextDouble();

            if (altura > alturaMaisAlta) {
                numeroMaisAlto = numeroInscricao;
                alturaMaisAlta = altura;
            }

            if (altura < alturaMaisBaixa) {
                numeroMaisBaixo = numeroInscricao;
                alturaMaisBaixa = altura;
            }

            somaAlturas += altura;
            totalAtletas++;
        }

        if(totalAtletas > 0)
           alturaMedia =  somaAlturas / totalAtletas;

        System.out.println("Número do atleta mais alto: " + numeroMaisAlto);
        System.out.println("Altura do atleta mais alto: " + alturaMaisAlta);
        System.out.println("Número do atleta mais baixo: " + numeroMaisBaixo);
        System.out.println("Altura do atleta mais baixo: " + alturaMaisBaixa);
        System.out.println("Altura média do grupo de atletas: " + alturaMedia);

        input.close();
    }
}