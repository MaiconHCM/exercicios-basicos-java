/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercíciosLista03;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício32 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int num;
        boolean ehPrimo=true;
        System.out.println("Informe um numero!");
        num=ler.nextInt();
        for(int i=2;i<=num/2;i++){
            if (num%1==0){
                ehPrimo=false;
                break;
            }
        }if (ehPrimo==true){
            System.out.println(num+" é primo");
        }else{
            System.out.println(num+" Não é primo!");
        }
    }
}
