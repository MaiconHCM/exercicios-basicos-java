/*24.Ler dois valores para as variáveis A e B, efetuar a troca dos valores de
forma que a variável A passe a possuir o valor da variável B e que a variável B 
passe a possuir o valor da variável A. Apresentar os valores trocados.
 */
package ExercíciosLista01;

import java.util.Scanner;

public class Exercício24 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int A,B,C;
        System.out.println("Informe o valor de A");
        A=ler.nextInt();
        System.out.println("Informe o valor de B");
        B=ler.nextInt();
        C=A;
        A=B;
        B=C;
        System.out.println("A:"+A+"\nB:"+B);
    }
}
