/*9. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um 
vetor C, onde cada elemento de C é a divisão dos respectivos elementos em A e B,
ou seja:
C[i] = A[i] / B[i].
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício09 {
    public static void main(String[] args) {
        int a[]=new int [10];
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*100);
            
        }int b[]=new int [10];
        for (int i = 0; i < b.length; i++) {
            b[i]= (int) (Math.random()*100);
            
        }double c[]=new double [10];
        for (int i = 0; i < c.length; i++) {
            c[i]=(double)a[i]/b[i];
            System.out.printf("%d / %d = %f\n",a[i],b[i],c[i]);   
        }
    }
}
