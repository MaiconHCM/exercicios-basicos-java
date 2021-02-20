/*8. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um 
vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos em
A e B, ou seja:
C[i] = A[i] * B[i].
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício08 {
    public static void main(String[] args) {
        int a[]=new int [10];
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*100);
            
        }int b[]=new int [10];
        for (int i = 0; i < b.length; i++) {
            b[i]= (int) (Math.random()*100);
            
        }int c[]=new int [10];
        for (int i = 0; i < c.length; i++) {
            c[i]= a[i]*b[i];
            System.out.printf("%d X %d = %d\n",a[i],b[i],c[i]);
        }
    }
}
