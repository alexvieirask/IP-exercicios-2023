import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        char caracter;

        caracter = input.next().charAt(0);

        caracter = Character.toUpperCase(caracter);

       
        if (caracter == 'M'){
            System.out.println("Masculino");
        } 
        else if (caracter == 'F') {
            System.out.println("Feminino");
        }
        else if (caracter == 'I'){
            System.out.println("Não informado");
        }
        else{
            System.out.println("Entrada Incorreta");    
        }
    
        input.close();
    }
}
