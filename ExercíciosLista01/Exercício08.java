/*8.	Efetuar a leitura de um número inteiro e apresentar o resultado do cubo
deste número.
*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício08 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b;
        System.out.println("Escreva o valor desejado");
        a = ler.nextInt();
        b = a*a*a;
        System.out.println("O valor "+a+" ao quadrado é ingual a "+b);
    }
}
