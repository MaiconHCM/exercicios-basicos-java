/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercícioListaExtra02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício04 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        double a,b;
        System.out.println("Informe % de rendimento mensal da aplicação");
        a=ler.nextDouble();
        System.out.println("Informe o valor aplicado pelo cliente:");
        b=ler.nextDouble();
        System.out.println("Mês         Valor (R$)");
        for (int i = 1; i <= 12; i++) {
            b=((b/100)*a)+b;
        System.out.printf("%2d         %9.2f\n",i,b);
        }
    }
}
