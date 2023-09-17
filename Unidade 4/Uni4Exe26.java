/*
Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

import java.util.Scanner;

public class Uni4Exe26{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String opcao;
    
        double resultado;
        
        double  b,
                h,
                l,
                r;
                
        System.out.println("------ Opções ------");
        System.out.println("T - Cacular área de um triângulo de base b e altura h");
        System.out.println("Q - Calcular a área de um quadrado de lado l");
        System.out.println("R - Calcular a área de um retângulo de base b e altura h");
        System.out.println("C - Calcular a área de um circulo de raio r");
        
        System.out.print("Escreva o número da opção desejada: ");
        opcao = input.next().toUpperCase();

        switch (opcao){
            case "T":
                System.out.print("Digite a base do triângulo: ");
                b = input.nextDouble();
        
                System.out.print("Digite a altura do triângulo: ");
                h = input.nextDouble();

                resultado = (b*h) / 2;

                System.out.println("Resultado: "+resultado);

                break;

            case "Q":
                System.out.print("Digite o lado do quadrado: ");
                l = input.nextDouble();
        
                resultado = l * l;

                System.out.println("Resultado: "+resultado);
        
                break;

            case "R":
                System.out.print("Digite a base do retângulo: ");
                b = input.nextDouble();
        
                System.out.print("Digite a altura do ret\u00E2ngulo: ");
                h = input.nextDouble();

                resultado = b*h;
                
                System.out.println("Resultado: "+resultado);

                break;

            case "C":
                System.out.print("Digite o raio r do circulo: ");
                r = input.nextDouble();

                resultado = 3.1415 * (r*r);
                
                System.out.println("Resultado: "+ resultado);

                break;
            default:
                System.out.print("Opção inválida.");
                break;
        }
        input.close();
    }
}