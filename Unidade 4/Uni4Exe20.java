/*
Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo 
que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:

A atribuição dos conceitos obedece à tabela abaixo:

media	conceito
>= 9.0	A
>= 7.5 e < 9.0	B
>= 6.0 e < 7.5	C
>= 4.0 e < 6.0	D
< 4.0	E
O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem 
"aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.


*/

import java.util.Scanner;

public class Uni4Exe20{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double notaProva1,
               notaProva2,
               notaProva3,
               notaExercicios;

        double media;
        char conceito = 'A';

        System.out.print("Escreva a nota da prova 1: ");
        notaProva1 = input.nextDouble();

        System.out.print("Escreva a nota da prova 2: ");
        notaProva2 = input.nextDouble();

        System.out.print("Escreva a nota da prova 3: ");
        notaProva3 = input.nextDouble();

        System.out.print("Escreva a nota dos Exercicios: ");
        notaExercicios = input.nextDouble();

        media = (notaProva1 + notaProva2 *2 + notaProva3 * 3 + notaExercicios) / 7;

        if(media >= 7.5 && media < 9.0)
            conceito = 'B';
        if(media >= 6.0 && media < 7.5)
            conceito = 'C';
        if (media >= 4.0 && media < 6.0)
            conceito = 'D';
        if (media < 4.0 ) 
            conceito = 'E';

        System.out.println("Conceito: "+conceito);
        System.out.println("Média de Aproveitamento: "+media);
        
        if (conceito == 'A' || conceito == 'B'  || conceito == 'C')
            System.out.println("aprovado"); 
        else
            System.out.println("reprovado");
        input.close();
    }
}
