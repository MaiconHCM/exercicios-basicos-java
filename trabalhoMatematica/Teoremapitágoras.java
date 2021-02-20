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
public class Teoremapitágoras {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("c²=a²+b²");
        System.out.println("Insira valor de a²");
        double a,b; boolean c=true;
        a=ler.nextDouble();
        a=a*a;
        System.out.println("Insira valor de b²(0 = X)");
        b=ler.nextDouble();
        if(b==0){
        System.out.println("Insira valor de c³");
        b=ler.nextDouble();
        c=false;
        }
        b=b*b;
        System.out.println(b);
        if (c==false) {
        a=b-a; 
        }else{
        a=a+b;
        }a=Math.sqrt(a);
        System.out.println("X = "+a);
    }
}
