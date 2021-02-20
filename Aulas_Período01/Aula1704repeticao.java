
package Aulas_Período01;

import java.util.Scanner;

public class Aula1704repeticao {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe número:");
        int num;
        num=ler.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"x"+num+"= "+(i*num));
        }
    }
}
