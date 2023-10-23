/*
Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

escreva os nomes dos alunos que tem 18 anos;
escreva a quantidade de alunos que tem idade acima de 20 anos.
*/

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n;

        int alunosComDezoitoAnos = 0,
            alunosAcimaDeVinteAnos = 0;
        
        String nome;

        System.out.print("Digite o número de alunos na turma: ");
        n = input.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o nome do aluno " + i + ": ");
            nome = input.next();
            
            System.out.print("Digite a idade do aluno " + i + ": ");
            int idade = input.nextInt();

            if (idade == 18) {
                System.out.println("Aluno com 18 anos: " + nome);
                alunosComDezoitoAnos++;
            }

            if (idade > 20) {
                alunosAcimaDeVinteAnos++;
            }
        }

        System.out.println("Quantidade de alunos com 18 anos: " + alunosComDezoitoAnos);
        System.out.println("Quantidade de alunos com idade acima de 20 anos: " + alunosAcimaDeVinteAnos);

        input.close();
        
    }
}