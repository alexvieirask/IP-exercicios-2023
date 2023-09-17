/*
Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado

0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se x for positivo e y, negativo
3, se os dois valores forem negativos
4, se x for negativo e y, positivo
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

import java.util.Scanner;

public class Uni4Exe19{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
       
        double X,Y;

        System.out.print("x = ");
        X = input.nextDouble();

        System.out.print("y = ");
        Y = input.nextDouble();

        if (X == 0 && Y == 0){
            System.out.println("Quadrante 0");
        } 
       
        if (X > 0 && Y > 0){
            System.out.println("Quadrante 1");
        } 
          
        if (X > 0 && Y<0){
            System.out.println("Quadrante 2");
        } 
        
        if (X < 0 && Y < 0){
            System.out.println("Quadrante 3");
        } 
        
        if(X<0 && Y > 0){
            System.out.println("Quadrante 4");   
        }

        input.close();
    }
}
