//exemplo de IF
package Aulas_Período01;

import java.util.Scanner;

public class Aula1303If {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;
        System.out.println("Informe um numero:");
        a = ler.nextInt();        if (a % 2 == 0) {
            System.out.println(a + " é par");
        } else {
            System.out.println(a + " é número é impar");
        }

        if (a == 0) {
            System.out.println(a + " é zero");
        } else if (a <= 100) {
            System.out.println(a + "<=100");
        } else if (a <= 1000) {
            System.out.println(a + "<=");
        } else{
            System.out.println(a+" > que 1000");
        }
    }
}
