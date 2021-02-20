/*4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo 
tipo e tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do
respectivo elemento de A, ou seja: 
B[i] = (Math.sqrt(A[i]))(;.
 */
package ExercíciosLista04;

public class Exercício04 {
    public static void main(String[] args) {
    int a[]=new int[15];
    double b[]=new double[15];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()* 100);
        }for (int i = 0; i < b.length; i++) {
            b[i]=(Math.sqrt(a[i]));
            
        }for (int i = 0; i < b.length; i++) {
    System.out.printf("a[%d] = %d b[%d] = %f\n",i,a[i],i,b[i]);

            
        }
    }
}
