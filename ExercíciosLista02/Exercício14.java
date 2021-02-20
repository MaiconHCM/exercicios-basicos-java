/*14. Construa um algoritmo que leia três valores inteiros e os coloque em ordem
crescente.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício14 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b,c;
        System.out.println("Informe primeiro número");
        a=ler.nextInt();
        System.out.println("Informe o segundo número");
        b=ler.nextInt();
        System.out.println("Informe o terceiro número");
        c=ler.nextInt();
        if ((a<b)&&(a<c)){
            System.out.print("o valor é " +a);
            if (b<c){
                System.out.println(","+b+","+c);
            }else System.out.println(","+c+","+b);
        }else if ((b<a)&&(b<c)){
            System.out.print("O valor é "+b);
            if (a<c){
                System.out.println(","+a+","+c);
            }else {System.out.println(","+c+","+a);
            
            }
        }else {
            System.out.print("O valor é "+c);
            if (a<b){
                System.out.println(","+a+","+b);
            }else{
                System.out.println(","+b+","+a);
            }
        }
    }
    
}
