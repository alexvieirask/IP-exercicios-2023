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
