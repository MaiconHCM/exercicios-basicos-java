/*Desenvolva um programa que leia o código do item pedido, a quantidade e 
calcule o valor a ser pago por aquele lanche. A compra será finalizada quando o
código do produto for 0.
 */
package RevisãoProva04;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício05 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a;double b=0,c=0;
        while(true){
            System.out.println("Informe código do produto(0 para sair):");
            a=ler.nextInt();
            if(a==100){
                System.out.println("Cachorro frio");
                b=3.10;
            }else if(a==101) {
                System.out.println("Pão com banha");
                b=2.10;
            }else if (a==102) {
                System.out.println("Suco que parece de limão é de groselha e tem"
                        + " gosto de tamarindo");
                b=1;
                System.out.println("Infome a quantidade:");
            }else {
                System.out.println("Erro no código, programa encerrado");
                break;
            }
            System.out.println("Valor unitario: "+b);
            System.out.println("Informe a quantidade");
            a=ler.nextInt();
            b=b*a;
            c=c+b;
            System.out.println("Valor total: "+b+"\ntotal da conta:"+c);
        }System.out.println("Total da conta "+c);
    }
}
