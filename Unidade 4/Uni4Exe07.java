/*
O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso
superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem 
aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        double valorPagar, qtAdicional;
        double peso, pesoExcedido; 

        System.out.print("Entre com o peso da carta: ");
        peso = input.nextDouble();

        if (peso <= 50.0){
            valorPagar = 0.45;
        }
        else{
            pesoExcedido = peso - 50.0;

            qtAdicional = (pesoExcedido / 20) + 1;
            
            valorPagar = 0.45 + 0.45 * qtAdicional;
        }

        System.out.println("Custo do selo: "+ df.format(valorPagar));
        input.close();
    }
}
