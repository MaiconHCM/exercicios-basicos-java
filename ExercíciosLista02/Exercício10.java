/*10. Efetuar a leitura de três números inteiros e apresentar o maior valor.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b,c;
        System.out.println("Informe o primeiro valor");
        a=ler.nextInt();
        System.out.println("Informe o segundo valor");
        b=ler.nextInt();
        System.out.println("Informe o terceiro valor");
        c=ler.nextInt();
        if ((a>b)&&(a>c)){
            System.out.println("O maior valor é " +a);
        }
        else if ((b>a)&&(b>c)){System.out.println("O maior valor é "+b);
        
        }else {
            System.out.println("O maior valor é "+c);
        }
    }
    
}
