/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício02 {
    public static void main(String[] args) {
        int a[]=new int [8];
        int b[]=new int [8];
        
        for (int i = 0; i < a.length; i++) {
            a[i] =(int) (Math.random()*30);
            
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=a[i]*2;
            
        }for (int i = 0; i < b.length; i++) {
            System.out.printf("a[%d] = %d b[%d] = %d\n",i,a[i],i,b[i]);
            
        }
    }
}
