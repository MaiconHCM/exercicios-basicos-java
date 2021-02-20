/*12.	Ler três números inteiros e imprimir a média.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício12 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int a,b,c;
        double resultado;
        System.out.println("escreva a porcaria do números");
        a = ler.nextInt();
        System.out.println("escreva mais um numero");
        b = ler.nextInt();
        System.out.println("digite o ultimo numero");
        c = ler.nextInt();
        resultado = ((double)a+b+c)/3;
        System.out.println("O resultado da divisão é "+resultado);
    }
}
