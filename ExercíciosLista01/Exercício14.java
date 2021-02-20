/*14.	Ler um valor e imprimir esse valor com reajuste de 10%.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int a;double b,c,d;
        System.out.println("digite o adoravel valor");
        a = ler.nextInt();
        b = (double)a/100;
        c = b*10;
        d = a+c;
        System.out.println("O valor do reajuste de 10% é de "+d);
    }
}
