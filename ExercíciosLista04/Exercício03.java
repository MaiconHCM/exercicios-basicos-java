/*3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo 
tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do 
respectivo elemento de A, ou seja: 
B[i] = A[i] * A[I].
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício03 {
    public static void main(String[] args) {
        int a[]=new int[15],b[]=new int [15];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*100);
        }for (int i = 0; i < b.length; i++) {
            b[i]= a[i]*a[i];
            
        }for (int i = 0; i < b.length; i++) {
            System.out.printf("a[%d] = %d b[%d] = %d\n",i,a[i],i,b[i]);
            
        }
    }
}
