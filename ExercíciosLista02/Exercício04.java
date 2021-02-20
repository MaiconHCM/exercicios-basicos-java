package ExercíciosLista02;

import java.util.Scanner;

public class Exercício04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;
        System.out.println("Informe um número");
        a = ler.nextInt();
        if (a < 0) {
            System.out.println("Valor negativo");
        } else if(a == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Valor positivo");
        }
    }
}
