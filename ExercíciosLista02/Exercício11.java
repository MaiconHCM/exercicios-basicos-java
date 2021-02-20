/*11. Efetuar a leitura de três valores inteiros e apresentar o valor do meio.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b,c;
        System.out.println("Informe o primeiro numero");
        a=ler.nextInt();
        System.out.println("Informe o segundo numero");
        b=ler.nextInt();
        System.out.println("Informe o terceiro numero");
        c=ler.nextInt();
        if ((a>b)&&(a<c)) {
            System.out.println("O "+a+" é o valor do meio");
        }else if ((a<b)&&(a>c)) {
            System.out.println("O "+a+" é o valor do meio"); }
        else if ((b>a)&&(b<c)) {
            System.out.println("O "+b+" é o valor do meio"); }
        else if ((b<a)&&(b>c)) {
            System.out.println("O "+b+" é o valor do meio"); }
        else {
            System.out.println("O "+c+" é o valor do meio");
        }
        
    }
}
