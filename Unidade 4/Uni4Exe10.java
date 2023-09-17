/*
Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as 
idades dos filhos e exibir quem é o caçula da família; suponha que não haja empates.
*/

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int idadePrimeiroFilho, idadeSegundoFilho, idadeTerceiroFilho;

        System.out.print("Digite a idade do Marquinhos: ");
        idadePrimeiroFilho = input.nextInt();
        
        System.out.print("Digite a idade do Zezinho: ");
        idadeSegundoFilho = input.nextInt();
        
        System.out.print("Digite a idade da Luluzinha: ");
        idadeTerceiroFilho = input.nextInt();

        if (idadePrimeiroFilho < idadeSegundoFilho && idadePrimeiroFilho < idadeTerceiroFilho){
            System.out.println("O filho caçula é o Marquinhos! idade: "+ idadePrimeiroFilho);
        } 
        else if (idadeSegundoFilho < idadePrimeiroFilho && idadeSegundoFilho <idadeTerceiroFilho){
            System.out.println("O filho caçula é o Zezinho! idade: "+idadeSegundoFilho);
        } 
        else{
            System.out.println("A filha caçula é a Luluzinha! idade: "+idadeTerceiroFilho);
        }

        input.close();
    }
}
