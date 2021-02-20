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
public class Exercício20vetores2 {
    public static void main(String[] args) {
        int a[]=new int [10];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*100);
            System.out.printf("a[%2d] = %2d \n",i,a[i]);
        }int menor=0,aux;
        for (int i = 0; i < a.length; i++) {
            menor= i;
            for (int j = 0; j < a.length; j++) {
                if (a[j]<a[menor]){
                    menor=j;
                }
                
            }aux=a[i];
            a[i]=a[menor];
            a[menor]=aux;
            
        }
        System.out.println("Vator ordenado");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]=%2d\n",i,a[i]);
            
        }
    }
}
