/*24. Ler um número inteiro que representa o dia da semana e apresentar o nome
do dia correspondente, por exemplo: 0 = domingo, 1 = segunda-feira,
2 = terça-feira, 3 = quarta-feira, 4 = quinta-feira, 5 = sexta-feira e 
6 = sábado.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício24 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe um número");
        int a;
        a=ler.nextInt();
        if (a==0){
            System.out.println("Domingo");
        }else if (a==1){
            System.out.println("Segunda-feira");
        }else if (a==2){
            System.out.println("Terça-feira");
        }else if (a==3){
            System.out.println("Quarta-feira");
        }else if (a==4){
            System.out.println("Quinta-feira");
        }else if (a==5){
            System.out.println("Sexta-feira");
        }else {
            System.out.println("Sábado");
        }
    }
}
