/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matématica;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Logarítmos {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b; double c;
        System.out.println("    a\nLOG\n    b");
        System.out.println("Insira valor de b:");
        b=ler.nextInt();
        System.out.println("Insira valor de a:");
        a=ler.nextInt();
        System.out.println(b+"°="+a);
        c=Math.log(a)/Math.log(b);
        System.out.println("X = "+c);
    }
}
