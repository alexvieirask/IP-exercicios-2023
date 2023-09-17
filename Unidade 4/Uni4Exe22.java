/*
Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. 
Considerando que o sistema apresenta 3 cursos disponíveis (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação) 
descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando o título que o aluno vai receber caso opte por aquele curso. 
As titulações são respectivamente: "Bacharel em Ciência da Computação", "Licenciado em Computação" e "Bacharel em Sistemas de Informação".
*/

import java.util.Scanner;

public class Uni4Exe22{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int opcaoCurso;

        System.out.println("Cursos Disponíveis:");
        System.out.println("1 - Ciência da Computação:");
        System.out.println("2 - Licenciatura da Computação");
        System.out.println("3 - Sistemas de Informação:");

        System.out.print("Escolha uma opção de curso (1, 2 ou 3): ");
        opcaoCurso = input.nextInt();

        switch (opcaoCurso){
            case 1:
                System.out.println("Título: Bacharel em Ciência da Computação");
                break;
            
            case 2: 
                System.out.println("Título: Licenciado em Computação");
                break;
            
            case 3:
                System.out.println("Título: Bacharel em Sistemas da Informação");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        input.close();
    }
}
