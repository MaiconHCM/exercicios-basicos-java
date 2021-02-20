/*20. Dados dois números A e B, faça um programa que calcule a soma de todos os
inteiros existentes entre A e B.*/
package ExercíciosLista03;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício20 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe o numero a");
        int a,b;
        a=ler.nextInt();
        System.out.println("Informe o numero b");
        b=ler.nextInt();
        int c=0;
        for (a = 0; a <= b; a++) {
            c=c+a;
        }System.out.println(""+c);
    }
}
