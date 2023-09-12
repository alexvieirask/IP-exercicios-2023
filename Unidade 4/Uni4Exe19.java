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
