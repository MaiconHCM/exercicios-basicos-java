/*12. Efetuar a leitura de três números inteiros e apresentar o maior e o menor 
valor.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício12 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b,c;
        System.out.println("Informe o primeiro numero");
        a=ler.nextInt();
        System.out.println("Informe o segundo numero");
        b=ler.nextInt();
        System.out.println("Informe o terceiro numero");
        c=ler.nextInt();
        if ((a>b)&&(a>c)){
            System.out.println("O "+a+" é o maior número");
            if ((b<a)&&(b<c)){
                System.out.println("O "+b+" é o menor número");
            }else {
                System.out.println("O "+c+" é o menor número");
            }
        }else if((b>a)&&(b>c)){
            System.out.println("O "+b+" é o maior número");
            if ((a<b)&&(a<c)){
                System.out.println("O "+a+" é o menor número");}
            else {
                System.out.println("O "+c+" é o menor número");
            }
        }else if ((c>a)&&(c>b)){
            System.out.println("O "+c+" é o maior número");
            if ((a<b)&&(a<c)){
                System.out.println("O "+a+" é o menor número");}
            else {
                System.out.println("O "+b+" é o menor número");
            }
        }else{System.out.println("Os números são iguais");
            
        }
    }
   
}
