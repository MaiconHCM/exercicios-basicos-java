/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisãoProva04;

/**
 *
 * @author Maicon
 */
public class Exercício02 {
    public static void main(String[] args) {
        int a=1000; double b=0;
        for (int i = 1; i <= 50; i++) {
            System.out.println(a+"/"+i);
            b=b+a/i;
            a=a-3;
        }System.out.println("Soma total é "+b);
    }
}
