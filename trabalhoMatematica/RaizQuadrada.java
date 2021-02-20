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
public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe o grau da raiz");
        int grau,raiz; double d,a=1,b;
        grau=ler.nextInt();
        System.out.println("Informe o número");
        raiz=ler.nextInt();
        grau=grau-1;
        while (true){
        a=a+0.0000001;
        b=a;
            for (int i = 1; i <= grau; i++) {
            b=b*a;
            
            }if (b==raiz){
                System.out.printf("%.2f\n",a);
                break;
            }else if (b>raiz){
            while (true) {
          a=a-0.00000001;
          b=a;
                for (int i = 1; i <= grau; i++) {
                    b=b*a;
                    if (b<=raiz){
                      System.out.printf("%.2f\n",a);
                      System.exit(0);
                    }
                }
        }}
    }}
}
