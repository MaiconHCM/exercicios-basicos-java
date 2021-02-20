/*30. Faça um programa que receba a idade de uma pessoa e classifique-a seguindo
os critérios abaixo:
Idade
Classificação
0 a 2 anos-         Recém-nascido 
3 a 11 anos-        Criança 
12 a 19 anos-       Adolescente 
20 a 55 anos-       Adulto 
Acima de 55 anos-   Idoso 
Se a idade informada for menor que zero informar que a idade, neste caso,
é inválida. 
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício30 {
    public static void main(String[] args) {
       Scanner ler=new Scanner (System.in);
        System.out.println("Informe a idade");
        int a;
        a=ler.nextInt();
        if (a<0){
            System.out.println("Idade inválida!");
        }else if (a<=2){
            System.out.println("Recém-nascido");
        }else if (a<=11){
            System.out.println("Criança");
        }else if (a<=19){
            System.out.println("Adolescente");
        }else if (a<=55){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }
}
