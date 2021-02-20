/*26. Ler o numerador e o denominador de uma divisão e realizá-la verificando a 
“divisão por zero”.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício26 {
    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in);
       int a,b;double c;
        System.out.println("Informe o numerador:");
        a=ler.nextInt();
        System.out.println("Informe o denominador:");
        b=ler.nextInt();
        if (b==0){
            System.out.println("Imposivel efetuar divisão por zero");
        }else{
            c=(double)a/b;
            System.out.println(a+"/"+b+"="+c);
        }
    }
}
