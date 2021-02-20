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
public class Trigonometria {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double b, a;
        boolean flag = true;
        System.out.println("Informe se é seno(1), cosseno(2) ,tangente(3), Cossecante (4), Secante(5), Contangente (6)");
        a = ler.nextDouble();
        System.out.println("Infome os Graus");
        b = ler.nextDouble();
        b = Math.toRadians(b);
        if (a == 1) {
            b = Math.sin(b);
            System.out.println("Informe Cateto oposto (0=X)");
            a = ler.nextDouble();
            if (a == 0) {
                System.out.println("Informe a hipotenusa");
                a = ler.nextDouble();
                flag = false;
            }
        } else if (a == 2) {
            b = Math.cos(b);
            System.out.println("Informe Cateto adjacente (0=X)");
            a = ler.nextDouble();
            if (a == 0) {
                System.out.println("Informe a hipotenusa ");
                a = ler.nextDouble();
                flag = false;
            }
        } else if (a == 3) {
            b = Math.tan(b);
            System.out.println("Informe Cateto oposto (0=X)");
            a = ler.nextDouble();
            if (a == 0) {
                System.out.println("Informe o cateto adjacente");
                a = ler.nextDouble();
                flag = false;
            }
        } else if (a == 4) {
            b = Math.sin(b);
            b = 1 / b;
            System.out.println("Informe a hipotenusa (0=X)");
            a = ler.nextDouble();
            if (a == 0) {
                System.out.println("Informe Cateto oposto");
                a = ler.nextDouble();
                flag = false;

            }
        } else if (a == 5) {
            b = Math.cos(b);
            b = 1 / b;
            System.out.println("Informe a hipotenusa (0=X)");
            a = ler.nextDouble();
            if (a == 0) {
                System.out.println("Informe Cateto adjacente");
                a = ler.nextDouble();
                flag = false;
            }
        } else if (a == 6) {
            b = Math.tan(b);
            b = 1 / b;
            System.out.println("Informe a Adjacente (0=X)");
            a = ler.nextDouble();
            if (a == 0) {
                System.out.println("Informe Cateto Oposto");
                a = ler.nextDouble();
                flag = false;
            }

        } else {
            System.out.println("Valor desconhecido");
        }
        if (flag == true) {
            a = a / b;
        } else {
            a = a * b;
        }

        System.out.println("X = " + a);
    }
}
