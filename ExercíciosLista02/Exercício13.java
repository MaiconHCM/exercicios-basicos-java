/*13. Efetuar a leitura de quatro números inteiros e apresentar o maior valor.
 */
package ExercíciosLista02;

import java.util.Scanner;
public class Exercício13 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b,c,d;
        System.out.println("Informe o primeiro número");
        a=ler.nextInt();
        System.out.println("Informe o segundo número");
        b=ler.nextInt();
        System.out.println("Informe o terceiro número");
        c=ler.nextInt();
        System.out.println("Informe o quarto número");
        d=ler.nextInt();
        if ((a>b)&&(a>c)&&(a>d)) {
            System.out.println("O "+a+" é o maior número");
        }else if ((b>a)&&(b>c)&&(b>d)){
            System.out.println("O "+b+" é o maior número");
        }else if ((c>a)&&(c>b)&&(c>d)){
            System.out.println("O "+c+" é o maior número");
        }else{
            System.out.println("O "+d+" é o maior número");
        }
        
    }
}
