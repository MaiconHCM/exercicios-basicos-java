/*8. Escreva um programa que leia um número e verifique se ele está fora do 
intervalo entre 5 e 20.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício08 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in); 
        System.out.println("Informe o número");
        int a;
        a=ler.nextInt();
        if ((a>=5)&&(a<=20)){
            System.out.println("Está dentro do intervalo");
        }else {
            System.out.println("Está fora do intervalo");
        }
    }
    
}
