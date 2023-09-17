/*
Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses. 
Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve 
solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.
*/

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int mesesAdmitidos;

        double porcentagemReajuste = 0.0;

        System.out.print("Digite a quantidade de meses que o funcionário foi admitido: ");
        mesesAdmitidos = input.nextInt();

        if (mesesAdmitidos <= 12)
            porcentagemReajuste = 5.00;
        
        if (mesesAdmitidos >= 13 && mesesAdmitidos <= 48)
            porcentagemReajuste = 7.00;

        System.out.println("O valor de reajuste será de "+ porcentagemReajuste + "%");
        
        input.close();
    }
}
