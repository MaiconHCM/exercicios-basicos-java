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
public class Triaguloequilatero {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        double a;
        System.out.println("Informe a medidas do lado do triângulo equilatero:");
        a=ler.nextDouble();
        a=a*a;
        a=a/4;
        System.out.println("Área="+a+"√3");
    }
}
