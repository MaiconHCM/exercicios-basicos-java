/*10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão
do respectivo elemento de A por 2 (dois), ou seja: B[i] = A[i] % 2.
 */
package ExercíciosLista04;

public class Exercício10 {
    public static void main(String[] args) {
        int a[]=new int [10];
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*100);
            
            
        }int b[]=new int [10];
        for (int i = 0; i < b.length; i++) {
            b[i]=a[i]%2;
            System.out.printf("resto da divisão %d por 2 é %d\n",a[i],b[i]);
        }
    }
}
