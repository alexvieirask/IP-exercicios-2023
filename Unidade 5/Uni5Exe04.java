/*
Descreva um algoritmo para calcular o valor de S dado por:

\normalsize&space;S=\frac{3}{2}+\frac{5}{6}+\frac{7}{12}+\frac{9}{20}+\frac{11}{30}+\cdots

Considere os 20 primeiros termos da série.
*/

import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int n = 20;

        double S = 0.0;

        int numerador = 3,
            denominador = 2;
    

        for (int i = 1; i <= n; i++) {
            S +=  numerador / denominador;
            
            numerador += 2;
            denominador += 2 * (i+1);
        }

        System.out.println("O valor da série S é: " + S);
        
        input.close();
    }
}
