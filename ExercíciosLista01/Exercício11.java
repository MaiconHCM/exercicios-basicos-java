/*11.	Ler um número inteiro e imprimir seu sucessor e seu antecessor.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício11 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número desejado:");
        a=ler.nextInt();
        b=a+1;
        c=a-1;
        System.out.println("O sucessor é "+b+" e o antecessor é "+c);
    }
}
