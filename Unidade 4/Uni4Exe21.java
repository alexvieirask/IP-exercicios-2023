import java.util.Scanner;

public class Uni4Exe21{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double massa, altura;
        
        double IMC; 
        String classificacao = "Magreza";

        System.out.print("Escreva a massa do indivíduo: ");
        massa = input.nextDouble();

        System.out.print("Escreva a altura do indivíduo: ");
        altura = input.nextDouble();

        IMC = massa  / (altura * altura);

        if (IMC >= 18.5 && IMC <= 24.9)
            classificacao = "Saudável";
        
        if (IMC >= 25.0 && IMC <= 29.9 )
            classificacao = "Sobrepeso";
        
        if (IMC >= 30.0 && IMC <= 34.9)
            classificacao = "Obesidade Grau I";
        
        if (IMC >= 35.0 && IMC <= 39.9)
            classificacao = "Obesidade Grau II (severa)";

        if (IMC >= 40.0)
            classificacao = "Obesidade Grau III (mórbida)";

        System.out.println("IMC: "+IMC);
        System.out.println("Classificação: "+classificacao);
        
        input.close();
    }
}
