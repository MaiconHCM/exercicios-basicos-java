/*9. Apresentar o fatorial de um número informado pelo usuário 
(ex. Fatorial de 5 = 5 * 4 * 3 * 2 * 1). */
package ExercíciosLista03;

import java.util.Scanner;

public class Exercício09 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe um número");
        int a,b;
        a=ler.nextInt();
        for (int i = 1; i <= a; i++) {
            b=i*i;
            System.out.println("Fatorial de "+i+":"+b);
        }
    }
    
}
