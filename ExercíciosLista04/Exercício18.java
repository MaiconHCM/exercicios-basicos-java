/*18. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um 
grupo de pessoas. Escreva um programa que determine e escreva a menor e a maior 
idades e suas respectivas posições.
 */
package ExercíciosLista04;

import java.util.Scanner;

public class Exercício18 {
    public static void main(String[] args) {
    int a[]=new int [10],b=0,c=100;
    Scanner ler=new Scanner (System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe a idade:");
            a[i]= ler.nextInt();
            if (a[i]>b) {
                b=a[i];
            }else if(a[i]<c){
                c=a[i];
            }        }System.out.printf("Maior: %d\nMenor: %d\n",b,c);
    }
}
