/*26. Um determinado material radioativo perde metade de sua massa a cada 50 
segundos. Dada a massa inicial, em gramas, fazer um programa que determine o 
tempo necessário para que essa massa se torne menor que 0,5 gramas; escreva a 
massa inicial, a massa final e o tempo calculado em horas, minutos e segundos.*/
package ExercíciosLista03;

import java.util.Scanner;

public class Exercício26 {
    public static void main(String[] args) {
     Scanner ler=new Scanner(System.in);
     double a; int c,d,e,f,b=0;
        System.out.println("Informe a massa");
        a=ler.nextDouble();
        while(true){
         a=a/2;
         b=b+50;
         c=b/3600;
         d=b%3600;
         e=d/60;
         d=d%60;
            if (a<=0.5) {
                break;
            }
        }System.out.println("Virara 0,5 gramas em "+c+" horas "+e+" minutos"+d+"s"
                + "egundos");
    }
}
