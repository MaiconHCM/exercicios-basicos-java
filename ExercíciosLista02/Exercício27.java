/*27. Desenvolver um programa que calcula e retorna o Gasto Energético Basal 
(GEB), utilizando as seguintes fórmulas:	
        para os homens: GEB = 66.47 + (13.75 * PC) + (5 * Alt) – (6.76 * I);
	para as mulheres: GEB = 655.1 + (9.56 * PC) + (1.85 * Alt) – (4.67 * I);
        Onde: PC- Peso Corporal em “kg”; Alt- altura em “cm” e I- Idade.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício27 {
    public static void main(String[] args) {
        double GEB,PC,Alt; int s,I;
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe se é homen(1) ou mulher(2)");
        s=ler.nextInt();
        System.out.println("Informe peso corporal(kg)");
        PC=ler.nextDouble();
        System.out.println("Informe a altura");
        Alt=ler.nextDouble();
        System.out.println("Informe a idade");
        I=ler.nextInt();
        if (s==1){
        GEB = 66.47+(13.75*PC)+(5*Alt)-(6.76*(double)I);
            System.out.println("Gasto enérgetico Basal é "+GEB);
        }else{
            GEB = 655.1+(9.56*PC)+(1.85*Alt)-(4.67 * I);
            System.out.println("Gasto enérgetico Basal é "+GEB);
        }
    }
}
