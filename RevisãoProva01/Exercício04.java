/*04 – Em um mapa com a escala 1 – 500km temos que cada centímetro corresponde a
500 quilômetros, mas esta escala pode ser variável. Se uma pessoa medir com
régua uma parte da figura ela poderá saber, aproximadamente, qual a distância 
entre duas cidades. Faça um programa que recebe a escala utilizada e a medida 
obtida pelo usuário e calcule a distância entre dois pontos do mapa.
 */
package RevisãoProva01;

import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int b; double a,c;
        System.out.println("Informe a distância em cm:");
        a=ler.nextDouble();
        System.out.println("Informe a escala do mapa:");
        b=ler.nextInt();
        c=a*b;
        System.out.println("A distância é de "+c+" KM");
    }
}
