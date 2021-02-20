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
public class JogoLogaritmo {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b,c=2,d,pontos=0;
        while(true){
        b= (int) (Math.random()*3)+c;
        d= (int) (Math.random()*4)+1;
        a=b;
            for (int i = 0; i < d; i++) {
            a=a*b;    
            }
        System.out.println("LOG "+a+" =X\n   "+b+"");
        System.out.println("Qual valor de X?");
        b=ler.nextInt();
        if (b==d+1){
            System.out.println("Resposta correta!\n================================");
            c=c+3;
            pontos=pontos+b+50;
        }else{
            System.out.println("Respota incorreta! A resposta correta era "+(d+1));
            System.out.println("Pontuação total: "+pontos);
            break;
        }
        }
        
        
       
        
    }
    }

