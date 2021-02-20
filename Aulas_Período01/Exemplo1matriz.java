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
public class Exemplo1matriz {
    public static void main(String[] args) {
        int M[][]= new int [3] [3];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j]=(int)(Math.random()*10);
                
            }
            
        }for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.printf("a[%d] [%d] = %d\n",i,j,M[i][j]);
            
        }
            
        }
    }
  
}
