/*9.Ler dois números inteiros informados pelo usuário e apresentar: o 
resultado da divisão real desses números, o quadrado do primeiro número e o 
cubo do segundo número.
*/
package ExercíciosLista01;

import java.util.Scanner;

public class Exercício09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b,d,f;
        double c;
        System.out.println("Informe o primeiro número:");
        a = ler.nextInt();
        System.out.println("Informe o segundo número");
        b = ler.nextInt();
        c = (double)a/b;
        d = a*a;
        f = b*b*b;
        System.out.println(a+" dividido por "+b+" resulta em "+c);
        System.out.println(a+" ao quadrado é igual a " + d);
        System.out.println(b+" ao quadrado é igual a "+f);
    }
}
