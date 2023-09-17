/*
Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        char letra; 
        
        System.out.print("Informe a letra: ");
        letra = input.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ){
            System.out.println("É vogal");
        } 
        else{
            System.out.println("NÃO é vogal");
        }

        input.close();
    }
}
