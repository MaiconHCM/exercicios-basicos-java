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
public class Exercício03 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int par=0,impar=0,a;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o "+i+"° número");
            a=ler.nextInt();
            if (a%2==0){
                par++;
            }else{
                impar++;
            }
        }System.out.println(par+" número pares e "+impar+" número impars");
        if (par>impar){
            System.out.println("A maioria dos números são pares");
        }else{
            System.out.println("A maioria dos números são impares");
        }
    }
}
