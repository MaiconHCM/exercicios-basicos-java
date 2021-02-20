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
public class Exercício10vetores2 {
    public static void main(String[] args) {
        int a[] = new int [10];
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*30);
            
        }for (int i = 0; i < a.length; i++) {
            System.out.println("Tabuada do "+a[i]);
            for (int j = 0; j <= 10; j++) {
                System.out.println(j+" X "+a[i]+" = "+(j*a[i]));
        }
        }
    }
}
