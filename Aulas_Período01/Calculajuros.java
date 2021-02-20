/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_Período01;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Calculajuros {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double a,d,c;
        int b;
        System.out.println("Valor I:");
        a=ler.nextDouble();
        System.out.println("Tempo:");
        b=ler.nextInt();
        System.out.println("Taxas de juros:");
        c=ler.nextDouble();
        d=a;
        for (int i = 0; i <= b; i++) {
            d=d+(d*c/100);
        }System.out.println("Valor final:"+d);
        System.out.println("Juros:"+(d-a));
    }
}
