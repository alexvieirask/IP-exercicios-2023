/*
Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. Os dados utilizados para votação obedecem a seguinte codificação:

1, 2, 3, 4 = voto para o respectivo candidato;
5 = voto nulo;
6 = voto em branco.
Elabore um programa que calcule e escreva:

total de votos para cada candidato;
total de votos nulos;
total de votos em branco;
percentual dos votos em branco e nulos sobre o total.
Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de opção 
correto. Para interromper a operação, o usuário poderá fornecer o número 0.
*/

import java.util.Scanner;

public class Uni5Exe33{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int votosCandidato1 = 0,
            votosCandidato2 = 0,
            votosCandidato3 = 0,
            votosCandidato4 = 0,
            votosNulos = 0,
            votosBranco = 0;

        int voto,
            totalVotos = 0;

        double percentualNulos,
               percentualBranco;

        do {
            System.out.println("Digite o número do candidato (1, 2, 3, 4), 5 para voto nulo, 6 para voto em branco ou 0 para encerrar:");
            voto = input.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBranco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta. Digite um número válido.");
            }

            totalVotos++;

        } while (voto != 0);

        percentualNulos =  votosNulos / totalVotos * 100;
        percentualBranco = votosBranco / totalVotos * 100;

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + votosCandidato1);
        System.out.println("Candidato 2: " + votosCandidato2);
        System.out.println("Candidato 3: " + votosCandidato3);
        System.out.println("Candidato 4: " + votosCandidato4);
       
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBranco);
        
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualBranco + "%");
       
        System.out.println("Total de votos registrados: " + totalVotos);

        input.close();
    }
}