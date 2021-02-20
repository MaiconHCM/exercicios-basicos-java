/*Fazer um programa que leia “cinco” números inteiros. Para cada número lido 
deverá ser exibida a sequência dos números pares de 0 até o número gerado 
mostrando ao final da sequência a soma dos números pares mostrados. Precisa de 
um for que vai de 1 a 5 e outro que vai de 1 até o número lido.
 */
package RevisãoProva05;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o "+i+"° número");
            a=ler.nextInt();
            b=0;
            for (int j = 0; j <= a; j++) {
                if (j%2==0) {
                    System.out.print(j+", ");
                    b=j+b;
                }
            }System.out.println("soma="+b);
        }
    }
    
}
