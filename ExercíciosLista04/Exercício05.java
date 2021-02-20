/*5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo 
tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo 
elemento de A multiplicado por sua posição (ou índice), ou seja: 
B[i] = A[i] * i.
 */
package ExercíciosLista04;

public class Exercício05 {
    public static void main(String[] args) {
    int a[]= new int [10], b[]=new int [10];
        for (int i = 0; i < b.length; i++) {
            a[i]= (int) (Math.random()*100);
            
            }for (int i = 0; i < b.length; i++) {
            b[i]= a[i]*i;
                
            }
            for (int i = 0; i < b.length; i++) {
               System.out.printf("a[%d] = %d  b[%d] = %d\n",i,a[i],i,b[i]);
                
            
        }
    }
}
