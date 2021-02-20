/*1 – Faça um programa para calcular quantos metros de areia estão sendo 
transportados por um caminhão. Leia os valores de comprimento, largura e altura
e apresente o volume de areia transportada. Utilize para o cálculo a fórmula
volume = comprimento * largura * altura. Por fim solicite ao usuário a distância
percorrida pelo caminhão e aumente a metragem de areia em 15%.
 */
package RevisãoProva02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício01 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        double a,b,c,d,e,f,r;
        System.out.println("Informe o comprimento:");
        a=ler.nextDouble();
        System.out.println("Informe a largura:");
        b=ler.nextDouble();
        System.out.println("Informe a altura:");
        c=ler.nextDouble();
        d=a*b*c;
        System.out.println("Informe a metragem:");
        e=ler.nextInt();
        f=15*(d/100);
        r=d+f;
                
        System.out.println("O quantida de areia é de "+d+"o adicional e de"+f+""
        + "e soma total "+r);
        
    }
}
