/*18.Determinar o consumo médio de um automóvel através da fórmula:
Consumo Médio = Distância / Litros de Combustível consumido.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício18 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double a,b,c;
        System.out.println("Digite a distância percorrida");
        a=ler.nextDouble();
        System.out.println("Digite a quantidade de litros gasto");
        b=ler.nextDouble();
        c=a/b;
        System.out.println("O cosumo médio de combustivel é de "+c);
    }
}
