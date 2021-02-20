/*23. Escreva um programa que realize a multiplicação de dois números informados
pelo usuário através de somas sucessivas, ou seja, para fazer A X B basta somar 
o valor da variável A, B vezes.*/
package ExercíciosLista03;

import java.util.Scanner;

public class Exercício23 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Informe primeiro numero");
        a=ler.nextInt();
        System.out.println("Informe o segundo numero");
        b=ler.nextInt();
        for (int i = 1; i <= b; i++) {
           c=a+c;
            System.out.println(a+"X"+i+"="+c);
        }
        }
    }
