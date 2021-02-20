/*9. Ler dois valores inteiros (variáveis A e B) e apresentar a adição destes
valores, quando a variável A for maior que B, caso contrário, efetuar a 
multiplicação das variáveis.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício09 {
    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in);
       int a,b,c;
        System.out.println("Informe o primeiro valor");
        a=ler.nextInt();
        System.out.println("Informe o segundo valor");
        b=ler.nextInt();
        if (a>b) {
            c=a+b;
            System.out.println("Soma: ");
        }
        else {
            c=a*b;
            System.out.print("Multiplicação: ");
        }
        System.out.println(c);
    }
}
