/*Desenvolva um programa que leia o índice (%) de rendimento de uma aplicação 
qualquer e a seguir mostre uma tabela com os valores em reais no intervalo de 
R$ 100,00 até R$ 1.000,00 de R$ 50,00 em R$ 50,00, como mostra a figura à 
direita para um índice informado de 0,85%:
 */
package RevisãoProva04;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício04 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe o indice de aplicação:");
        double a,b,c;
        a=ler.nextDouble();
        System.out.println("Aplicação   Rendimento   Saldo");
        for (double i = 100; i <= 1000; i=i+50) {
        b=(i/100)*a;
        c=i+b;
        System.out.printf("%9.2f   %9.2f   %9.2f\n",i,b, c);    
        }
    }
}
