/*
Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar, o motorista encheu o 
tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, foi registrado o valor do odômetro e a 
quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). Descreva um algoritmo 
que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem.
*/

import java.util.Scanner;

public class Uni5Exe13{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numReabastecimentos;

        double quilometragemPorLitro,
               quilometragemMedia,
               quilometragemTotal = 0,
               litrosTotal = 0;

        double odometro, 
               litros;


        System.out.print("Informe o número total de reabastecimentos feitos: ");
        numReabastecimentos  = input.nextInt();

        System.out.println("Informe os dados de reabastecimento em cada parada:");
        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.print("Odômetro na parada " + i + ": ");
            odometro = input.nextDouble();
            System.out.print("Quantidade de combustível (litros) na parada " + i + ": ");
            litros = input.nextDouble();

            quilometragemPorLitro = (odometro - quilometragemTotal) / litros;
            quilometragemTotal = odometro;
            litrosTotal += litros;

            System.out.println("Quilometragem por litro na parada " + i + ": " + quilometragemPorLitro);
        }

        quilometragemMedia = quilometragemTotal / litrosTotal;
        System.out.println("Quilometragem média em toda a viagem: " + quilometragemMedia + " km/l");

        input.close();
    }
}