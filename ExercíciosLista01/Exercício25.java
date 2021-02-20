/*25.Efetuar a leitura de um número inteiro e apresentar a raiz quadrada
deste valor (utilizar a função Math.sqrt).*/
package ExercíciosLista01;

import java.util.Scanner;

public class Exercício25 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("informe um número");
        int a; double b;
        a=ler.nextInt();
        b=(double)Math.sqrt(a);
        System.out.println("Raiz quadrada de "+a+" é "+b);
    }
}
