/*15.Escreva um programa para ler o salário mensal de um funcionário e o
percentual de reajuste. Calcular e escrever o valor do novo salário.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int b; double a,c,d;
        System.out.println("Digite o salário atual do funcionario:");
        a=ler.nextDouble();
        System.out.println("Digite o valor (%) do reajuste desejado:");
        b=ler.nextInt();
        c=a/100;
        d=c*b+a;
        System.out.println("O salário reajustado é de "+d);
    }
}
