import java.util.Scanner;

public class Uni4Exe25{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int opcao;
        
        double  numeroUm, 
                numeroDois;

        double resultado;
        
        System.out.println("------ Opções ------");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença de dois números");
        System.out.println("3 - Produto de dois números");
        System.out.println("4 - Divisão entre dois números(o denominador não pode ser zero)");
        
        System.out.print("Escreva o número da opção desejada: ");
        opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.print("Digite o primeiro número: ");
                numeroUm = input.nextDouble();
        
                System.out.print("Digite o segundo número: ");
                numeroDois = input.nextDouble();

                resultado = numeroUm + numeroDois;

                System.out.println("Resultado: "+resultado);

                break;

            case 2:
                System.out.print("Digite o primeiro número: ");
                numeroUm = input.nextDouble();
        
                System.out.print("Digite o segundo número: ");
                numeroDois = input.nextDouble();

                resultado = numeroUm - numeroDois;

                System.out.println("Resultado: "+resultado);

                break;

            case 3:
                System.out.print("Digite o primeiro número: ");
                numeroUm = input.nextDouble();
        
                System.out.print("Digite o segundo número: ");
                numeroDois = input.nextDouble();

                resultado = numeroUm * numeroDois;

                System.out.println("Resultado: "+resultado);

                break;

            case 4:
                System.out.print("Digite o primeiro número: ");
                numeroUm = input.nextDouble();
        
                System.out.print("Digite o segundo número: ");
                numeroDois = input.nextDouble();

                if (numeroDois == 0){
                    System.out.println("O denominador não pode ser zero.");
                    break;
                }
                 
                resultado = numeroUm  / numeroDois;

                System.out.println("Resultado: "+resultado);

                break;
            default:
                System.out.print("Opção inválida.");
                break;
        }

        input.close();
    }
}
