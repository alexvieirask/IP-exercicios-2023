/*
Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, 
que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos,
onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas 
(em R$) e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a
 seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. 
O número de produtos (n) de cada vendedor deve ser informado.
*/

import java.util.Scanner;

public class Uni5Exe23{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double  totalVendas = 0.0,
                salario;
            
        int numeroProdutos,
            quantidadeVendida;
        
        double precoProduto;

        String nome;

        while (true) {
            System.out.print("Informe o nome do vendedor: ");
            
            nome = input.nextLine();
        
            System.out.print("Quantos produtos foram vendidos pelo vendedor " + nome + "? ");
            numeroProdutos = input.nextInt();

            for (int i = 1; i <= numeroProdutos; i++) {
                
                System.out.print("Informe o preço do produto " + i + ": R$");
                precoProduto = input.nextDouble();
                
                System.out.print("Informe a quantidade vendida do produto " + i + ": ");
                quantidadeVendida = input.nextInt();
                totalVendas += precoProduto * quantidadeVendida;
            }

            salario = totalVendas * 0.30; 

            System.out.println("Nome do vendedor: " + nome);
            System.out.println("Total de vendas: R$" + totalVendas);
            System.out.println("Salário do vendedor: R$" + salario);

            input.nextLine(); 

            System.out.print("Deseja digitar os dados de mais um vendedor? (s para SIM / n para NÃO): ");
            String resposta = input.nextLine().toLowerCase();

            if (resposta.equals("n")) 
                break;
        }

        input.close();
    }
}