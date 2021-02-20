/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_Período01;

import java.util.Scanner;

public class Jogoadvinha {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b,c=0;
        a=(int)(Math.random()*100000);
        while(true){
            System.out.println("Escolha um número");
            b=ler.nextInt();
            c++;
            if(b==a){
                break;
            }else if(b>a){
                System.out.println("é menor!");
            }else{
                System.out.println("é maior!");
            }
            
        }if (c<=23){
            System.out.println("Bom");
        }else if (c<=30){
            System.out.println("Razoavel");
        }else{
            System.out.println("Péssimo");
        }
        System.out.println("Tentativas totais:"+c);
    }
    
}
