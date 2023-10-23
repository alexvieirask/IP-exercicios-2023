/*
Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, 
na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos 
quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos 
são quebrados no final de cada dia (a máquina opera 16 horas por dia).
*/

public class Uni5Exe11{
    public static void main(String[] args) throws Exception {
        int horasOperacao = 16,
            biscoitosQuebrados = 0,
            biscoitosQuebradosNaHoraAnterior = 1;

        for (int i = 1; i <= horasOperacao; i++) {
            biscoitosQuebrados += biscoitosQuebradosNaHoraAnterior;
            System.out.println("Hora " + i + ": " + biscoitosQuebradosNaHoraAnterior + " biscoitos quebrados.");
            biscoitosQuebradosNaHoraAnterior *= 3;
        }

        System.out.println("--------------------------------------");
        System.out.println("Final do dia: " + biscoitosQuebrados + " biscoitos quebrados.");
        
    }
}