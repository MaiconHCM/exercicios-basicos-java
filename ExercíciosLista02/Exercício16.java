/*	Elabore um programa que, dada a idade de um nadador, classifique-o em 
uma das seguintes categorias:
infantil A = 5 - 7 anos
infantil B = 8 - 10 anos
juvenil A = 11 - 13 anos
juvenil B = 14 - 17 anos
sênior = maiores de 17 anos
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício16 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a;
        System.out.println("Informe a idade do nadador");
        a=ler.nextInt();
        if ((a>=5)&&(a<=7)){
            System.out.println("Infatil A");
        }
        else if((a>=8)&&(a<=10)) {
        System.out.println("Infantil B");
    } else if ((a>=11)&&(a<=13)){
            System.out.println("Juvenil A");
    }else if ((a>=14)&&(a<=17)){
            System.out.println("Juvenil B");
    }else {
            System.out.println("Senior");
    }
    }
}
