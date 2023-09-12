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
