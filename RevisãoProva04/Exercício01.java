/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisãoProva04;

public class Exercício01 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 7; i <= 70; i++) {
            if (i%7==0){
                System.out.println(i);
                a=a+i;
            }
        }System.out.println("A soma é "+a);
    }
}
