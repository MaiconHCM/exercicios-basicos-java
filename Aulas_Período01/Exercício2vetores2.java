/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_Período01;

/**
 *
 * @author Maicon
 */
public class Exercício2vetores2 {
    public static void main(String[] args) {
        int a[]= new int[3],b[]=new int [3];
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*2);
            b[i]= (int) (Math.random()*2);
           
        }boolean eh = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=b[b.length]) {
                eh=false;
            }
            
        }for (int i = 0; i < b.length; i++) {
            System.out.printf("a[%d] = %2d  b[%d]= %2d");
            
        }
    }
}
