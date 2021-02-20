/*25. Um ano é bissexto se for divisível por 4 e não for divisível por 100.
Também são bissextos os divisíveis por 400. Escreva um algoritmo que determina
se um ano informado pelo usuário é bissexto.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício25 {
    public static void main(String[] args) {
       Scanner ler=new Scanner (System.in);
       int a;
        System.out.println("Informe o ano:");
        a=ler.nextInt();
        if (((a%4==0)&&(a%100!=0))||(a%400==0)){
            System.out.println("Esse ano é bissexto");
        }else {
            System.out.println("Esse ano não é bissexto");
        }
    }
}
