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
public class Exercício0506vetoresparte2 {
    public static void main(String[] args) {
        int a[]=new int [10],b[]= new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*50);
            
        }for (int i = 0; i < a.length; i++) {
            b[a.length-1-i] = a [i];
            
            
        }for (int i = 0; i < b.length; i++) {
            System.out.printf("A [%d] = %2d b[%2d] = %2d \n",i,a[i],i,b[i]);
            
        }
    }
}
