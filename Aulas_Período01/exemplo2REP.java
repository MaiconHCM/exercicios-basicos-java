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
public class exemplo2REP {
    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        int sm,ct,ctu,num;
        double md,pt;
        while (true){
            System.out.println("Número (-1 sai)");
            num=ler.nextInt();
            if (num<0){
                break;
            }
            sm=0;ct=0;ctu=0;
            for (int i = 1; i <= num; i++) {
                if (i%3==0){
                    ctu++;
                    sm=sm+i;
                }
                ct++;
            }md=(double)sm/ctu;
            pt=(double)ctu/ct*100;
            System.out.println("Soma m de 3:        "+sm);
            System.out.println("Cont m de 3:        "+ctu);
            System.out.println("Percentual de m 3:  "+pt);
            System.out.println("Média m de 3:       "+md);
        }
    }
}
