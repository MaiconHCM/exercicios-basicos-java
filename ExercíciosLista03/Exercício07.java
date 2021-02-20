/*7. Apresentar os resultados da tabuada de um número qualquer.*/
package ExercíciosLista03;

import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe o número desejado:");
        int a;
        a=ler.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a+"X"+i+"="+a*i);
        }
    }
    
}
