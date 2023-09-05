import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    
        int dependentes, porcentagemTotal;

        double rendaAnual, rendaLiquidaMensal; 

        double valorImposto, porcentagemImposto; 

        System.out.print("Digite a renda anual: ");
        rendaAnual = input.nextDouble();

        System.out.print("Digite a quantidade de dependentes: ");
        dependentes = input.nextInt();

        porcentagemTotal = 2 * dependentes;
        rendaLiquidaMensal = (rendaAnual - ((rendaAnual / 100) * porcentagemTotal)) / 12;

        if (rendaLiquidaMensal <= 2000.00){
            porcentagemImposto = 0;
            valorImposto = 0; 
        } 
        else if (rendaLiquidaMensal > 2000.00 && rendaLiquidaMensal <= 5000.00){
            porcentagemImposto = 5.00;
        } 
        else if (rendaLiquidaMensal > 5000.00 && rendaLiquidaMensal <= 10000.00){
            porcentagemImposto = 10.00;
        }else{
            porcentagemImposto = 15.00;
        }
        
        valorImposto = (rendaLiquidaMensal / 100 ) * porcentagemImposto;

        input.close();
    }
}