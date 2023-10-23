/*
Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa. 
Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:

um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.
*/

import java.util.Scanner;

public class Uni5Exe25{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int pontosE = 0,
            pontosD = 0; 

        while (true) {
            System.out.print("Informe o código do ponto (D/E): ");
            char ponto = input.next().charAt(0);

            if (ponto == 'D') {
                pontosD++;
            } 
            else if (ponto == 'E') {
                pontosE++;
            } 
            else {
                System.out.println("Código de ponto inválido. Use 'D' ou 'E'.");
                continue;
            }

            if (pontosD >= 21 || pontosE >= 21) {
                int diferencaPontos = Math.abs(pontosD - pontosE);
                
                if (diferencaPontos >= 2) {
                    if (pontosD > pontosE) {
                        System.out.println("Jogador à direita venceu!");
                    } else {
                        System.out.println("Jogador à esquerda venceu!");
                    }
                    break;
                }
            }
        }
        input.close();
    }
}