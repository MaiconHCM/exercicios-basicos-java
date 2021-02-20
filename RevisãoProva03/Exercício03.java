/*Um hotel cobra R$ 300,00 a diária e mais uma taxa de serviços de acordo com:
	R$ 12,00 por diária, se o número de diárias for maior que 15;
	R$ 14,00 por diária, se o número de diárias for igual a 15;
	R$ 20,00 por diária, se o número de diárias for menor que 15.
Faça um programa que solicite o número de dias que uma pessoa ficará hospedada e
que imprima o valor das diárias, o valor das taxas de serviço e o total a pagar 
da pessoa. 
 */
package RevisãoProva03;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe o número de dias que ira ficar hospedado:");
        int a;double b,c;
        a=ler.nextInt();
        if (a<15){
            b=12;
            System.out.println("valor da diária: "+b+" R$");
        }else if (a==15){
            b=14;
            System.out.println("Valor da diária: "+b+" R$");
        
    }else {
            b=20;
            System.out.println("Valor da diária: "+b+" R$");
        }
        c=300+a*b;
        System.out.println("O valor a pagar é de "+c+" R$");
    }
    
}
