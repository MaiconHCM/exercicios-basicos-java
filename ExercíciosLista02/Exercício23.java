/*23. Ler um valor inteiro que representa o mês de uma data e apresentar o nome
do mês (janeiro, fevereiro, ...).
 */
package ExercíciosLista02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício23 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a;
        System.out.println("Informe o número do mês");
        a=ler.nextInt();
        if (a==1){
            System.out.println("Janeiro");
        }else if (a==2) {
            System.out.println("Fevereiro");
        }else if (a==3) {
            System.out.println("Março");
        }else if (a==4) {
            System.out.println("Abril");
        }else if (a==5) {
            System.out.println("Maio");
        }else if (a==6) {
            System.out.println("Junho");
        }else if (a==7) {
            System.out.println("Julho");
        }else if (a==8){
            System.out.println("Agosto");
        }else if (a==9) {
            System.out.println("Setembro");
        }else if (a==10) {
            System.out.println("Outubro");
        }else if (a==11) {
            System.out.println("Novembro");
        }else {
            System.out.println("Dezembro");
        }
    }
}
