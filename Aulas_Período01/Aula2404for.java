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
public class Aula2404for {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int num,sm=0,mt=1,ct=0;
        for (int i = 1; i <= 3; i++) {
            System.out.println(i+"° número");
            num=ler.nextInt();
            //exemplo de soma
            sm=sm+num;
            //exemplo de multiplicação
            mt=mt*num;
            //exemplo de contagem
            if (num %2==0){
                ct++;
            }System.out.println("soma "+sm);
            System.out.println("mult "+mt);
            System.out.println("contag "+ct);
        }
    }
}
