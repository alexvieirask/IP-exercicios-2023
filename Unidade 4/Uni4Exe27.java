/*
As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. 
Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. 
Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 
hora e 35 minutos pagará por duas horas. 
Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de 
chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. 
Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários 
de chegada e de partida e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá 
haver validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, 
e sempre chegam e saem no mesmo dia.
*/

import java.util.Scanner;

public class Uni4Exe27{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int horasEstacionadas, minutosEstacionados;
        double precoEstacionamento = 5;
        int horasFinais = 0;

        String horaChegada, horaPartida;

        System.out.print("Escreva a hora de chegada (00 00): ");
        horaChegada = input.nextLine();

        System.out.print("Escreva a hora de partida (00 00): ");
        horaPartida = input.nextLine();

        String[] partesHoraChegada = horaChegada.split(" "), 
                 partesHoraPartida = horaPartida.split(" ");

        horasEstacionadas =  Integer.parseInt(partesHoraPartida[0]) - Integer.parseInt(partesHoraChegada[0]);
        minutosEstacionados = Integer.parseInt(partesHoraPartida[1]) - Integer.parseInt(partesHoraChegada[1]); 
        horasFinais = horasEstacionadas;

         if (minutosEstacionados > 29)
            horasFinais = horasEstacionadas + 1;
        
        switch (horasFinais){
            case 3:
            case 4:
                precoEstacionamento = 7.50;
                break;
            
            default:
                precoEstacionamento = 10.00;
                break;
        }
        
        System.out.println("Horario de Chegada: " +     partesHoraChegada[0] + ":" + partesHoraChegada[1]);
        System.out.println("Horario de Partida: " +     partesHoraPartida[0] + ":" + partesHoraPartida[1]);
        System.out.println("Preço por Hora: "     +     precoEstacionamento);
        System.out.println("Preço Total Estacionamento: " + (horasFinais * precoEstacionamento));

        input.close();
    }
}