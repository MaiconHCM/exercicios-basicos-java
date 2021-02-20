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
public class GrausSenoCoseTanj {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
         double a,b;
         System.out.println("Insira valor do grau:");
         a=ler.nextDouble();
         a=Math.toRadians(a);
         b=Math.sin(a);System.out.println("Seno: "+b);
         b=Math.cos(a);System.out.println("Coseno: "+b);
         b=Math.tan(a);System.out.println("Tangente: "+b);
         b=1/Math.sin(a);System.out.println("Cossecante: "+b);
         b=1/Math.cos(a);System.out.println("Secante: "+b);
         b=1/Math.tan(a);System.out.println("Contagente: "+b);
    }
}
