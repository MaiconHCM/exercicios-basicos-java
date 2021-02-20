/*17. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um 
grupo de pessoas. Escreva um programa que determine e escreva a quantidade de 
pessoas que possuem idade superior a 35 anos.
 */
package ExercíciosLista04;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício17 {
    public static void main(String[] args) {
        int a[]=new int[10],b=0;
        Scanner ler=new Scanner (System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe a idade");
            a[i]=ler.nextInt();
            if (a[i]>35) {
                b++;
            }
        }System.out.println("Total de pessoas com mais de 35: "+b);
    }
}
