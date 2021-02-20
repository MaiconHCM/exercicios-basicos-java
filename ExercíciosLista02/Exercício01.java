/*1. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o 
número lido como sendo um valor positivo, ou seja, o programa deverá apresentar 
o módulo de um número fornecido. Lembre-se de verificar se o número fornecido é 
menor que zero, sendo multiplique-o por –1.
*/
package ExercíciosLista02;
import java.util.Scanner;
public class Exercício01 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a;
        System.out.println("Informe um valor");
        a=ler.nextInt();
        if (a<0){
            a=a*-1;
        }
            System.out.println("O valor é "+a);
    }
}
