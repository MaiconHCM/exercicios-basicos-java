/*20. Efetuar a leitura de quatro números inteiros e apresentar os números que 
são divisíveis por 2 ou 3.
 */
package ExercíciosLista02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício20 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,a1,a2,b,b1,b2,c,c1,c2,d,d1,d2;
        System.out.println("informe o primeiro número:");
        a=ler.nextInt();
        System.out.println("Informe o segundo número:");
        b=ler.nextInt();
        System.out.println("Informe o terceiro número:");
        c=ler.nextInt();
        System.out.println("Informe o quarto número:");
        d=ler.nextInt();
        a1=(a%2);
        a2=(a%3);
        b1=(b%2);
        b2=(b%3);
        c1=(c%2);
        c2=(c%3);
        d1=(d%2);
        d2=(d%3);
        if ((a1==0)||(a2==0)) {
            System.out.println(a+" é divisivel por 2 ou 3");
        }
        if ((b1==0)||(b2==0)) {
            System.out.println(b+" é divisivel por 2 ou 3");
        }
        if ((c1==0)||(c2==0)) {
            System.out.println(c+" é divisivel por 2 ou 3");
        }
        if ((d1==0)&&(d2==0)) {
            System.out.println(d+" é divisivel por 2 ou 3");
        }
    }
}
