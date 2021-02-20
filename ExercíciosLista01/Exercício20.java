/*20.	Uma revendedora de carros paga aos seus vendedores um salário mensal 
fixo de R$ 800,00 mais uma comissão de R$ 300,00 por carro vendido.
Faça um programa que leia a quantidade de carros vendidos pelo funcionário,
calcule e mostre o seu salário total.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício20 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double a, b, c;
        System.out.println("Quantos carros foram vendidos por ele?");
        a=ler.nextDouble();
        b=a*300;
        c=800+b;
        System.out.println("Salário sera de "+c);
    }
}
