/*12. Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e a relação de todos os pares de 0 até o 
respectivo elemento.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício12 {
    public static void main(String[] args) {
        int a[]=new int [10];
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*30);
            System.out.printf("a[%d]=%d (",i,a[i]);
            for (int j = 0; j < a[i]; j+=2) {
                System.out.print(j+",");
            }System.out.println(")");
        }
    }
   
}
