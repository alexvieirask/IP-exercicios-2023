/*
Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre serão diferentes). 
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher 
mais velha.
*/

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int idadeHomemA, 
            idadeHomemB,
            
            menorIdadeHomem,
            maiorIdadeHomem;

        int idadeMulherA, 
            idadeMulherB,

            menorIdadeMulher,
            maiorIdadeMulher;

        int somaHomemMaisVelhoComMulherMaisNova, 
            produtoHomemMaisNovoComMulherMaisVelha;
        
        System.out.print("Escreva a idade do homem A: ");
        idadeHomemA = input.nextInt();

        System.out.print("Escreva a idade do homem B: ");
        idadeHomemB = input.nextInt();

        System.out.print("Escreva a idade da mulher A: ");
        idadeMulherA = input.nextInt();

        System.out.print("Escreva a idade da mulher B: ");
        idadeMulherB = input.nextInt();


        maiorIdadeHomem = idadeHomemB;
        menorIdadeHomem = idadeHomemA;
    
        if (idadeHomemA > idadeHomemB){
            maiorIdadeHomem = idadeHomemA;
            menorIdadeHomem = idadeHomemB;
        }

        maiorIdadeMulher = idadeMulherB;
        menorIdadeMulher = idadeMulherA;
    
        if (idadeHomemA > idadeHomemB){
            maiorIdadeMulher = idadeMulherA;
            menorIdadeMulher = idadeMulherB;
        }

        somaHomemMaisVelhoComMulherMaisNova = maiorIdadeHomem + menorIdadeMulher;
        produtoHomemMaisNovoComMulherMaisVelha = menorIdadeHomem * maiorIdadeMulher;

        System.out.println("Soma do homem mais velho com mulher mais nova: "+ somaHomemMaisVelhoComMulherMaisNova);
        System.out.println("Produto do homem mais novo com mulher mais velha: "+ produtoHomemMaisNovoComMulherMaisVelha);

        input.close();
    }
}