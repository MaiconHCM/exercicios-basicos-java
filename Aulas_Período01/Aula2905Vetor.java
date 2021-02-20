package Aulas_Período01;

import java.util.Scanner;

public class Aula2905Vetor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v[]=new int[5];
        for (int i = 0; i < v.length; i++) {
            System.out.println((i+1)+"° valor");
            v[i]=ler.nextInt();
            
        }
        for (int i = 0; i < v.length; i++) {
            System.out.printf("v[%2d] ====> %d\n",i,v[i]);
            
            
        }

    }
}
