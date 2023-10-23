/*
Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, 
em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada,
foi fornecido o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, 
considerando que em cada casa só existia uma televisão. Em casas onde a televisão estava desligada, foi registrado 
zero para o número do canal e para o número de pessoas. Baseado nisto descreva um algoritmo que calcule e escreva, para 
cada emissora, o percentual de audiência. A leitura deve ser finalizada quando for informado canal 0.
*/

import java.util.Scanner;

public class Uni5Exe18{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int canal4 = 0,
            canal5 = 0,
            canal9 = 0,
            canal12 = 0,
            totalPessoas = 0;
        
        int canal,
            pessoasAssistindo;

        double  percentualCanal4,
                percentualCanal5,
                percentualCanal9,
                percentualCanal12; 

        System.out.println("Digite o número do canal (4, 5, 9, 12) e o número de pessoas assistindo.");
        System.out.println("Para encerrar, digite canal 0.");

        while (true) {
            System.out.print("Canal: ");
            canal = input.nextInt();

            if (canal == 0) {
                break; 
            }

            System.out.print("Pessoas assistindo: ");
            pessoasAssistindo = input.nextInt();

            switch (canal) {
                case 4:
                    canal4 += pessoasAssistindo;
                    break;
                case 5:
                    canal5 += pessoasAssistindo;
                    break;
                case 9:
                    canal9 += pessoasAssistindo;
                    break;
                case 12:
                    canal12 += pessoasAssistindo;
                    break;
            }

            totalPessoas += pessoasAssistindo;
        }

        System.out.println("Resultados de audiência por canal:");
        if (totalPessoas > 0) {
            percentualCanal4 =  canal4 / totalPessoas * 100;
            percentualCanal5 =  canal5 / totalPessoas * 100;
            percentualCanal9 =  canal9 / totalPessoas * 100;
            percentualCanal12 = canal12 / totalPessoas * 100;

            System.out.printf("Canal 4: %.2f%% de audiência\n", percentualCanal4);
            System.out.printf("Canal 5: %.2f%% de audiência\n", percentualCanal5);
            System.out.printf("Canal 9: %.2f%% de audiência\n", percentualCanal9);
            System.out.printf("Canal 12: %.2f%% de audiência\n", percentualCanal12);
        } else {
            System.out.println("Nenhum dado de audiência foi registrado.");
        }

        input.close();
    }
}