/*
Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. Descreva um algoritmo que leia o limite diário (em quilogramas) 
e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário for excedido escreva uma mensagem 
e encerre a execução do algoritmo. Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar 
o peso de mais um peixe: s (SIM) / n (NÃO)?”.
*/

import java.util.Scanner;

public class Uni5Exe24{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double pesoTotalPesca = 0.0,
               limiteDiarioKg; 

        String resposta; 

        System.out.print("Informe o limite diário de peso em quilogramas: ");
        limiteDiarioKg = input.nextDouble() * 1000; 

        while (true) {
            System.out.print("Informe o peso do peixe em gramas: ");
            double pesoPeixe = input.nextDouble();

            pesoTotalPesca += pesoPeixe;

            if (pesoTotalPesca >= limiteDiarioKg) {
                System.out.println("Limite diário de peso excedido.");
                break;
            }

            input.nextLine(); 

            System.out.print("Deseja informar o peso de mais um peixe? (s para SIM / n para NÃO): ");
            resposta = input.nextLine().toLowerCase();

            if (resposta.equals("n")) {
                break;
            }
        }

        System.out.println("Peso total da pesca: " + pesoTotalPesca + " gramas");

        input.close();
    }
}