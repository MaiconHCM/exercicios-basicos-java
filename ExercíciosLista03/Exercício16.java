/*16. Faça um programa que imprima os ‘n’ primeiros números pares. */
package ExercíciosLista03;

import java.util.Scanner;

public class Exercício16 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a;
        System.out.println("Informe a quantidade desejada");
        a=ler.nextInt();
        int b=0;
        for (int i = 0; i <= a; i++) {
            b=b+2;
            System.out.println(""+b);
        }
    }
    
}
