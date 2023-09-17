/*
Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se 
eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma 
idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.
*/

import java.util.Scanner;
public class Uni4Exe11{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int anoNascimentoPrimeiroIrmao, 
            anoNascimentoSegundoIrmao, 
            anoNascimentoTerceiroIrmao;
        
        System.out.print("Digite o ano de nascimento do primeiro irmão: ");
        anoNascimentoPrimeiroIrmao = input.nextInt();

        System.out.print("Digite o ano de nascimento do segundo irmão: ");
        anoNascimentoSegundoIrmao = input.nextInt();

        System.out.print("Digite o ano de nascimento do terceiro irmão: ");
        anoNascimentoTerceiroIrmao = input.nextInt();

        boolean 
            ehTrigemeo = anoNascimentoPrimeiroIrmao == anoNascimentoSegundoIrmao && anoNascimentoPrimeiroIrmao == anoNascimentoTerceiroIrmao,
            ehGemeo = anoNascimentoPrimeiroIrmao == anoNascimentoSegundoIrmao   || 
                      anoNascimentoPrimeiroIrmao == anoNascimentoTerceiroIrmao  || 
                      anoNascimentoTerceiroIrmao == anoNascimentoSegundoIrmao;
        

        if (ehTrigemeo)
            System.out.println("TRIGÊMEOS");
        else if (ehGemeo)
            System.out.print("GÊMEOS");
        else
            System.out.println("APENAS IRMÃOS");
        
        input.close();
    }
}
