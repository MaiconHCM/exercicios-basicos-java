/*19.	Escreva um programa que dados os litros gastos, os quilômetros 
percorridos por um automóvel e o valor do litro de combustível, calcule os 
gastos de combustível em reais/km.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício19 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double a,b,c,d,e;
        System.out.println("Informe os litros gastos");
        a=ler.nextDouble();
        System.out.println("Informe os quilômetros percorridos");
        b=ler.nextDouble();
        System.out.println("Informe o custo do litro de gasolina");
        c=ler.nextDouble();
        d=c*a;
        e=d/b;
        System.out.println("O valor total gasto é de:"+d);
        System.out.println("O gasto do veiculo em reais por KM é de "+e);
    }
}
