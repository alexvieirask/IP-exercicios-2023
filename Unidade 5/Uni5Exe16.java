/*
Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero 
(gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) d
e cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.
*/

import java.util.Scanner;

public class Uni5Exe16{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int contMulheres = 0,
            contHomens = 0,
            contOutros = 0;

        double somaAlturaMulheres = 0;
        double somaAlturaHomens = 0;
        double somaAlturaOutros = 0;

        double mediaAlturaMulheres = 0,
               mediaAlturaHomens  = 0,
               mediaAlturaOutros = 0;
               
        while (true) {
            System.out.print("Informe a altura da pessoa (0 para encerrar): ");
            double altura = input.nextDouble();

            if (altura == 0) {
                break; 
            }

            input.nextLine(); 

            System.out.print("Informe o gênero (M/F/O): ");
            char genero = input.nextLine().charAt(0);

            if (genero == 'F' || genero == 'f') {
                somaAlturaMulheres += altura;
                contMulheres++;
            } 
            else if (genero == 'M' || genero == 'm') {
                somaAlturaHomens += altura;
                contHomens++;
            } 
            else if (genero == 'O' || genero == 'o'){
                somaAlturaOutros += altura;
                contOutros++;

            }
        }

        if (contMulheres > 0)
            mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
        
        if (contHomens > 0 )
            mediaAlturaHomens = somaAlturaHomens / contHomens;

        if (contOutros > 0)
            mediaAlturaOutros = somaAlturaOutros / contOutros;


        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Média de altura do grupo: " + (mediaAlturaMulheres + mediaAlturaHomens + mediaAlturaOutros));

        input.close();
    }
}