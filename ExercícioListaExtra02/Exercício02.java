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
public class Exercício02 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b,d=0;double c;
        System.out.println("Informe o limite inicial:");
        a=ler.nextInt();
        System.out.println("Informe o limite final:");
        b=ler.nextInt();
        System.out.println("Pares apresentados entre "+a+" e "+b);
        for (int i = b; i >= a; i--) {
            if (i%2==0){
                System.out.println(""+i);
                d=d+i;
            }
        }System.out.println("A soma total é:"+d);
    }
}
