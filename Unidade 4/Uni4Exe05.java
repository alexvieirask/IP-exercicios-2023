import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float numero;

        System.out.print("Digite o número: ");
        numero = input.nextFloat();

        if (numero % 2 != 0.00){
            System.out.println("O número que você digitou possuí casas decimais informadas.");
        } else{
            System.out.println("O número que você digitou não possuí casas decimais informadas.");
        }

        input.close();
    }
}
