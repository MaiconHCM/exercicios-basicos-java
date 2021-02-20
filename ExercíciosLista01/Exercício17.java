/*17.	Ler o preço de um produto e calcular o novo preço com desconto de 9%.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício17 {
    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        int b; double a,c,d,e;
        System.out.println("digite o preço do produto: ");
        a=ler.nextDouble();
        System.out.println("Digite a porcentagem de desconto: ");
        b=ler.nextInt();
        c=a/100;
        d=c*b;
        e=a-d;
        System.out.println("O valor com desconto é de "+e);
    }
}
