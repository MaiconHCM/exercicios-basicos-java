/*21.	Escreva um programa para ler o número de eleitores de um município,
o número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
que cada um representa em relação ao total de eleitores.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício21 {
    public static void main(String[] args) {
        int b,n,v,eleitores; double pb,pn,pv;
        Scanner ler=new Scanner(System.in);
        System.out.println("Total de eleitores:");
        eleitores=ler.nextInt();
        System.out.println("Votos brancos");
        b=ler.nextInt();
        System.out.println("Votos nulos");
        n=ler.nextInt();
        System.out.println("Votos Válidos");
        v=ler.nextInt();
        pb=(double)b/eleitores*100;
        pn=(double)n/eleitores*100;
        pv=(double)v/eleitores*100;
        System.out.println("Porcentagem de votos nulos: " +pb+"%");
        System.out.println("Porcentagem de votos brancos: "+pn+"%");
        System.out.println("Porcentagem de votos Válidos: "+pv+"%");
    }
}
