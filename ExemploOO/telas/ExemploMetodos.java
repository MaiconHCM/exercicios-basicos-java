/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Maicon
 */
public class ExemploMetodos {
    public static void main(String[] args) {
        mensagem("Módulos em java",6);
        direitos();
        System.out.println("Soma de 3 e 5:"+soma(3,5));
        direitos();
    }
    public static void mensagem(String m, int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" - "+m);
        }
    }
    public static void direitos (){
        System.out.println("By Maicon H.C. Machado - 07/2017.");
    }
    public static int soma (int a,int b){
        return a+b;
    }
}
