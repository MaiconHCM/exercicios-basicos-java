/*5. Efetuar a leitura de dois números inteiros e apresentar a relação existente
entre eles, ou seja, o primeiro é maior que o segundo, os números são iguais, ou
ainda, o segundo e maior que o primeiro.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        System.out.println("Informe o primeiro número");
        Scanner ler=new Scanner(System.in);
        int a,b;
        a=ler.nextInt();
        System.out.println("Informe o segundo número");
        b=ler.nextInt();
        if (a==b){
            System.out.println(a+" e "+b+" São inguais");
        }else if (a>b){
            System.out.println(a+" é maior que "+b);
        }else {
            System.out.println(a+" é menor que "+b);
        }
    }
}
