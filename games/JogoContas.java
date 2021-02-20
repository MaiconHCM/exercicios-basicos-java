/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class JogoContas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c,d=0,pontos=0;
        while (true) {
            a = (int) (Math.random() * 4)+d;
            b = (int) (Math.random() * 4)+d;
            c = (int) (Math.random() * 3);
            if (c == 0) {
                c = a + b;
                System.out.println("Quanto é " + a + " + " + b + " ?");
            } else if (c==1){
                c = a - b;
                System.out.println("Quanto é " + a + " - " + b + " ?");
            }else{
                c =- a - b;
                System.out.println("Quanto é -" + a + " - " + b + " ?");
            }
            
            a=ler.nextInt();
            if (a==c) {
                System.out.println("Resposta correta!");
                d=d+2;
                pontos=pontos+50+d;
            }else{
               System.out.println("Respota incorreta! A resposta correta era "+c);
            System.out.println("Pontuação total: "+pontos);
            break;
            }
        }

    }
}
