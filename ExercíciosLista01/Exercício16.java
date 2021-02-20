/*16.Calcular o salário líquido de uma pessoa. São fornecidos: o valor por 
hora, o número de horas trabalhadas e o % de desconto do INSS.*/
package ExercíciosLista01;
import java.util.Scanner;
public class Exercício16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int b,c; double a,d,e,f;
        System.out.println("Informe o valor do salário por hora:");
        a=ler.nextDouble();
        System.out.println("Informe o número de horas trabalhadas");
        b=ler.nextInt();
        System.out.println("Informe o desconto do INSS em %");
        c=ler.nextInt();
        d=b*a;
        e=(d/100)*c;
        f=d-e;
        System.out.println("Resultado "+f);
    }
}
