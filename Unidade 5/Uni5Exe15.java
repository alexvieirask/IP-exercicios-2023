/*
Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. 
Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.
*/

import java.util.Scanner;

public class Uni5Exe15{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String nome;

        double nota1, 
               nota2;
        
        double media;

        System.out.println("Digite o nome e as notas de cada aluno. Digite 'fim' no nome para encerrar.");
        while (true) {
            System.out.print("Nome do aluno: ");
            nome = input.nextLine();

            if (nome.equals("fim")) {
                break; 
            }

            System.out.print("Nota da primeira prova: ");
            nota1 = input.nextDouble();
            
            System.out.print("Nota da segunda prova: ");
            nota2 = input.nextDouble();
            
            input.nextLine(); 

            media = (nota1 + nota2) / 2;
            System.out.println("Média do aluno " + nome + ": " + media);
        }

        input.close();
    }
}