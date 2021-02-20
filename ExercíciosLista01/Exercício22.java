/*22.	Dado um número inteiro de 3 algarismos, inverter a ordem de seus
algarismos. Os três algarismos do número dado são diferentes de zero.
Utilize os operadores / e %.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício22 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Informe o valor de 3 digitos");
        a=ler.nextInt();
        b=a/100;
        a=a%100;
        c=a/10;
        a=a%10;
        d=a/1;
        System.out.println("O número em ordem invertida é "+d+c+b);
    }
}
