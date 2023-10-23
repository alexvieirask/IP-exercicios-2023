/*
Uma emissora de rádio decidiu promover uma eleição para determinar o melhor conjunto do ano segundo a opinião dos ouvintes. Entraram na disputa apenas os quatro conjuntos mais solicitados durante o ano. Os votos são informados através de códigos:

código	conjunto
1	Nenhum de Nós
2	CPM22
3	Skank
4	Jota Quest
Descreva um algoritmo que:

informe o total de votos para cada grupo;
informe o percentual dos votos para cada grupo;
informe o grupo vencedor.
O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados.
*/

import java.util.Scanner;

public class Uni5Exe28{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int votoNenhumDeNos = 0,
            votoCPM22 = 0,
            votoSkank = 0,
            votoJotaQuest = 0;
           

        char continuarVotando = 's';

        int codigo;

        double totalVotos = 0;

        while (continuarVotando == 's' || continuarVotando == 'S') {
            System.out.println("Escolha um conjunto para votar:");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");
            
            System.out.print("Digite o código do conjunto: ");
            codigo = input.nextInt();

            if (codigo >= 1 && codigo <= 4) {
                totalVotos++;
                if (codigo == 1) {
                    votoNenhumDeNos++;
                } else if (codigo == 2) {
                    votoCPM22++;
                } else if (codigo == 3) {
                    votoSkank++;
                } else if (codigo == 4) {
                    votoJotaQuest++;
                }
            } else {
                System.out.println("Código de conjunto inválido.");
            }

            System.out.print("Mais um voto (s/N)? ");
            continuarVotando = input.next().charAt(0);
        }

        System.out.println("Resultado da eleição:");

        double percentualNenhumDeNos = (votoNenhumDeNos / totalVotos) * 100;
        double percentualCPM22 = (votoCPM22 / totalVotos) * 100;
        double percentualSkank = (votoSkank /  totalVotos) * 100;
        double percentualJotaQuest = (votoJotaQuest / totalVotos) * 100;

        System.out.println("Nenhum de Nós: " + votoNenhumDeNos + " votos (" + percentualNenhumDeNos + "%)");
        System.out.println("CPM22: " + votoCPM22 + " votos (" + percentualCPM22 + "%)");
        System.out.println("Skank: " + votoSkank + " votos (" + percentualSkank + "%)");
        System.out.println("Jota Quest: " + votoJotaQuest + " votos (" + percentualJotaQuest + "%)");

        String vencedor = "Nenhum de Nós";
        int maxVotos = votoNenhumDeNos;

        if (votoCPM22 > maxVotos) {
            maxVotos = votoCPM22;
            vencedor = "CPM22";
        }
        if (votoSkank > maxVotos) {
            maxVotos = votoSkank;
            vencedor = "Skank";
        }
        if (votoJotaQuest > maxVotos) {
            vencedor = "Jota Quest";
        }

        System.out.println("O grupo vencedor é: " + vencedor);

        input.close();
    }
}