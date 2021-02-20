/*14. Escreva um programa que leia: o valor de uma aplicação, o percentual de 
rendimento mensal obtido por esta aplicação e o período do investimento; e 
retorne o valor da aplicação ao final do período de investimento.*/
package ExercíciosLista03;

import java.util.Scanner;

public class Exercício14 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe o valor da aplicação");
        double a,b,d;int c;
        a=ler.nextDouble();
        System.out.println("Informe o percentual de aplicação");
        b=ler.nextDouble();
        System.out.println("Informe o periodo de investimento");
        c=ler.nextInt();
        for (int i = 1; i <= c; i++) {
            d=a/100;
            d=d*b;
            a=a+d;
            System.out.println("no mês "+i+" você terá "+a);
        }
    }
}
