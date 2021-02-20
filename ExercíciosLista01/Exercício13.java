/*13.Escreva um programa que calcule e mostre o valor da conversão em dólar 
de um valor lido em real. O programa deverá ler o valor da cotação do dólar 
e a quantidade de reais*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double cotdollar,vlrreal,vlrdollar;
        System.out.println("Informe a cotação do dollar");
        cotdollar = ler.nextDouble();
        System.out.println("Informe o valor em reais que deseja converter");
        vlrreal = ler.nextDouble();
        vlrdollar = vlrreal/cotdollar;
        System.out.println("O valor de "+vlrreal+"R$ caso convertido sera de "
                + vlrdollar+" Dólars");
    }
}
