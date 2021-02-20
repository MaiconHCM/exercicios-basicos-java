/*Uma empresa deseja calcular a depreciação de seus bens. 

Para tanto pede-se para desenvolver um programa que obtenha: 
a taxa de depreciação anual para os bens 
o valor do bem a ser depreciado
o período em anos.

Mostrar os resultados com sugere a figura ao lado.

Lembre-se:
Depreciação := valor do bem * (taxa de depreciação anual / 100);
Valor do bem depreciado := valor do bem – depreciação;*/
package ExercícioListaExtra01;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe a taxa anual(%):");
        double a,b,d,f=0; int c;
        a=ler.nextDouble();
        System.out.println("Informe o valor do bem a ser depricado:");
        b=ler.nextDouble();
        System.out.println("Informe o  periodo de depriciação (em anos)");
        c=ler.nextInt();
        for (int i = 1; i <= c; i++) {
            d=b*(a/100);
            b=b-d;
            f=f+d;
            System.out.println("No ano "+i+" o valor da depriciação é "+d+" Valo"
                    + "r depriciado "+b);
            
        }System.out.println("Depriciação acumulada em "+c+" anos="+f);
    }
}
