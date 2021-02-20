/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisãoProva04;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício06 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b,c;
        System.out.println("Tamanho");
        a=ler.nextInt();
        System.out.println("Número para mostrar");
        b=ler.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(""+b);
            }System.out.println("");
        }
    }
  
}
