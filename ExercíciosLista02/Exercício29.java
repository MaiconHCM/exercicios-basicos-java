/*29. Elabore um programa que obtenha através do teclado a pontuação, em valores
inteiros, de um candidato ao concurso vestibular, nas seguintes área: exatas (e)
, humanas (h) e conhecimento geral (cg). A seguir deverá ser definida a média 
ponderada usando a seguinte expressão:                
mp = ((e * 3) + (h * 2) + cg) / 6;
A média ponderada calculada define o rendimento do candidato de acordo com a 
seguinte tabela:
Péssimo = 0 - 250 pontos
Ruim = 251 - 500 pontos
Regular = 501 - 700 pontos
Bom = 701 - 900 pontos
Excelente = maior que 900 pontos
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício29 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Pontos em exatas: ");
        int e,h,cg,mp;
        e=ler.nextInt();
        System.out.println("Pontos em humanas: ");
        h=ler.nextInt();
        System.out.println("Pontos em conhecimento geral: ");
        cg=ler.nextInt();
        mp=((e * 3) + (h * 2) + cg) / 6;
        System.out.println("Sua nota final foi "+mp);
        if (mp<250){
            System.out.println("Péssimo, melhor vc tentar ser lixeiro");
        }else if(mp<500){
            System.out.println("Ruim, viu o que da ficar assistindo séries?");
        }else if(mp<700){
            System.out.println("Regular, devia ter estudado mais...");
        }else if(mp<900) {
            System.out.println("Bom, Valeu a pena aquele cursinho!");
        }else {
            System.out.println("Excelente, VOCÊ É O FUTURO DESSE PAÍS");
        }
    }
}
