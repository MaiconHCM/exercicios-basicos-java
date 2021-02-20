/*22. Ler um valor inteiro que representa o mês de uma data e apresentar o 
trimestre correspondente.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício22 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a;
        System.out.println("Informe o n° do mês desejado");
        a=ler.nextInt();
        if (a<=3) {
            System.out.println("Está no primeiro trimestre");
        }else if (a<=6) {
            System.out.println("Está no segundo trimestre");
        }else if (a<=9){
            System.out.println("Está no terceiro trimestre");
        }else {
            System.out.println("Está no quarto e ultimo trimestre");
        }
    }
    
}
