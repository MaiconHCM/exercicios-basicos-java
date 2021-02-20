/*2. Ler um valor inteiro e informar, através de uma mensagem, se este valor é 
um número par ou ímpar.
 */
package ExercíciosLista02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício02 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe o valor:");
        int a;
        a=ler.nextInt();
        if (a%2==0){
            System.out.println(a+" é par");
        }
        else {
            System.out.println(a+" é impar");
        }
    }
}
