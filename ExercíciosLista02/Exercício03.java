/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercíciosLista02;

import java.util.Scanner;

/**
 *
 * @author LAB.04
 */
public class Exercício03 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int a,b;
        System.out.println("Escreva o primeiro valor");
        a=ler.nextInt();
        System.out.println("Escreva o segundo valor");
        b=ler.nextInt();
        if(a%b==0){
            System.out.println("O primeiro é multiplo do segundo");
        }else{
            System.out.println("Não são multiplos");
        }
    }
}
