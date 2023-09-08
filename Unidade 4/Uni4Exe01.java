import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        float horasMes, horasValor, salarioTotal, salarioExtra;

        System.out.print("Entre com as horas trabalhadas no mês: ");
        horasMes = input.nextFloat();

        System.out.print("Entre com o valor pago por hora: ");
        horasValor = input.nextFloat();

        salarioTotal = horasMes * horasValor;

        if (horasMes > 160){
            salarioExtra = (horasMes - 160) *(horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é: " + salarioTotal);

        input.close();
    }
}
