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
public class Aula2804while {
    public static void main(String[] args) {
        int vi=1,vf=10,i=1;
        //indo de 1 a 10
        while (vi<-vf)
        {System.out.println(i+"");
        i++;
        }
        //indo de 10 a 1
        i=10;vf=1;
    while(i>=vf){
        System.out.println(""+i);
        i--;
    }
//loop infinito
    i=0;
    int ct =0,num,sm=0;
    Scanner ler=new Scanner (System.in);
    while (true){
        System.out.println("Número?(-1 para sair)");
        num=ler.nextInt();
        //testar condição de parada
        if (num<0){
            break;
        }ct++;
        sm=sm+num;
    }System.out.println("Qtade:"+ct);
        System.out.println("Soma:"+sm);
    //juros
        double vi1=1000,vd1=10000,tj1=1;
    i=0;
    while(vi1<=vd1){
        vi1=vi1+(vi1+tj1/100);
        i++;
    }System.out.println("valor"+vi1);
        System.out.println("tempo"+1);
}  
}
