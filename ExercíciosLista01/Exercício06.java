/*6.	Escreva um programa que obtêm dois valores inteiros (variáveis A e B) e
apresente as operações de adição, subtração, multiplicação e divisão de A por B.
*/
package ExercíciosLista01;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        int a,b,soma,subt,multi;
        double divi;
        Scanner ler= new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        a = ler.nextInt();
        System.out.println("Informe o segundo número");
        b = ler.nextInt();
        soma = a+b;
        subt = a-b;
        multi = a*b;
        divi = (double)a/b;
        System.out.println("soma:"+soma+"\nsubtração:"+subt+"\nmultipli"
                + "cação:"+multi +"\ndivisão:"+divi);
    }
   
}
