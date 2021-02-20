/*10.Efetuar a leitura de um número inteiro e imprimir o resto da divisão (%)
deste número por 2.
*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int a,b;
        System.out.println("Escreva o numero desejado:");
        a = ler.nextInt();
        b = a%2;
        System.out.println("O resultado é "+b);
        
    }
}
