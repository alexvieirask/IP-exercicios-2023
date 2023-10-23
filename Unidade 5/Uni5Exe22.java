/*
Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. 
Em 1996 recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. 
Faça programa que determine o salário atual do funcionário.
*/

public class Uni5Exe22{
    public static void main(String[] args) throws Exception {
        double salario = 2000; 

        for (int ano = 1996; ano <= 2023; ano++) {
            double aumento = salario * 0.015; 
            salario += aumento; 

            System.out.println("Salário em " + ano + ": R$" + salario);
            
            aumento *= 2; 
        }

    }
}