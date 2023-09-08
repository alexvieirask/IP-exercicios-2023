import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int dia, 
            mes, 
            ano;

        System.out.print("Digite o dia: ");
        dia = input.nextInt();

        System.out.print("Digite o mês: ");
        mes = input.nextInt();

        System.out.print("Digite o ano: ");
        ano = input.nextInt();

        if(dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0){
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
                System.out.println("Valida");   
            } else{
                if (mes != 2 && dia < 31){
                    System.out.println("Valida");    
                } else{
                    if (mes == 2 && dia < 29){
                        System.out.println("Valida");    
                    } else {
                        if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano %400 !=0)){
                            System.out.println("Valida"); 
                        } else{
                            System.out.println("Não Valida"); 
                        }
                    }
                }
            }
        } else{
            System.out.println("Não valida");
        }




        


        
        input.close();
    }
}
