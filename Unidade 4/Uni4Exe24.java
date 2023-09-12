import java.util.Scanner;

public class Uni4Exe24{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int opcao;

        double  numeroUm, 
                numeroDois, 
                numeroTres,
                numeroTemporario;

        
        System.out.print("Digite o primeiro número: ");
        numeroUm = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        numeroDois = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        numeroTres = input.nextInt();


        System.out.println("------ ORDENAÇÃO ------");
        System.out.println("1 - Crescente");
        System.out.println("2 - Decrescente");
        System.out.println("3 - Maior Valor no Meio");
        
        System.out.print("Escreva o número da opção desejada: ");
        opcao = input.nextInt();

        switch (opcao){
            case 1:
                
            case 2:

            case 3:

        }

        input.close();
    }
}
