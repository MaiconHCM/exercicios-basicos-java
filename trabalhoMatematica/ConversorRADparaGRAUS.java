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
public class ConversorRADparaGRAUS {
    public static void main(String[] args) {
     Scanner ler=new Scanner (System.in);
        double a;
        System.out.println("Insira valor radianos para Graus");
        a=ler.nextDouble();
        a = Math.toDegrees(a);
        System.out.println(a+" Graus");   
    }
}
