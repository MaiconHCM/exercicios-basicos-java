/*13. Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e a relação de todos os divisores do respectivo
elemento.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício13 {
    public static void main(String[] args) {
       int a[]=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*20);
            System.out.printf("A[%d]=%d ",i,a[i]);
            System.out.print("(");
            for (int j =0; j <= a[i]; j++) {
                if ((double)a[i]%j==0) {
                    System.out.print(j+",");
                }
            }System.out.println(")");
            
        }
    }
}
