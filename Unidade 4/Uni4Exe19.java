/*
Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado

0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se x for positivo e y, negativo
3, se os dois valores forem negativos
4, se x for negativo e y, positivo
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/

public class Uni4Exe19{
    public static void main(String[] args) throws Exception {
        int a, b, c;
        a = 0;
        b = 15;
        c = 0;
        while (a <= b) {
               a = a + 3;
               b = b - a;
               c = b - a;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
}
}
