/* 7.	Efetuar a leitura de um número inteiro e apresentar o resultado do
quadrado deste número.
 */
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b;
        System.out.println("Insira o número desejado");
        a = ler.nextInt();
        b = a*a;
        System.out.println("O valor "+a+" ao quadrado é "+ b);
        
        
    }
}
