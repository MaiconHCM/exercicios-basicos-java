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
public class JogoDivisíveis {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b = 0, c,vetor[]=new int[3],d=1,pontos=0;
        while (true) {
            a = (int) (Math.random() * 5) + b + 2;
            System.out.println("Qual é o maior número dívisivel por: ");
            for (int i = 0; i < vetor.length; i++) {
                c = (int) (Math.random() * 25)+2;
                vetor[i]=a*c;
                System.out.print(vetor[i]+" ; ");
                if (d<vetor[i]) {
                    d=vetor[i];
                }
            }while (d>0){
                d--;
                if ((vetor[0]%d==0)&&(vetor[1]%d==0)&&(vetor[2]%d==0)) {
                break;
            }
            }
            
            c=ler.nextInt();
            if (c==d){
                System.out.println("Resposta correta!");
                b=b+2;
                pontos=pontos+50+d;
                d=0;
            }else{
                System.out.println("Respota incorreta! A resposta correta era "+d);
                System.out.println("Pontuação total: "+pontos);
                break;
            }
        }

    }
}
