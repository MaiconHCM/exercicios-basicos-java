/*07- Escreva um programa que leia um número e informe se ele se encontra
entre o intervalo entre 5 e 20
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a;
        System.out.println("Informe o número:");
        a=ler.nextInt();
        if ((a>=5)&&(a<=20)) {System.out.println("Está dentro do intervalo");
    }else {System.out.println("Está fora do intervalo");}
}}
