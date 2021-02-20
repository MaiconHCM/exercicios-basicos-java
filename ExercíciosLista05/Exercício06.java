/*6. Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e 
tamanho e com os mesmos elementos de A, sendo que estes deverão estar 
invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o 
segundo elemento de A passa a ser o penúltimo de B e assim por diante.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício06 {
    public static void main(String[] args) {
        int a[]=new int [10],b[]=new int[10];
        for (int i = 0; i < b.length; i++) {
            a[i]=(int) (Math.random()*20);
            b[a.length-i-1]=a[i];
            System.out.printf("A[%d]=%d  B[%d]=%d\n",i,a[i],a.length-i-1,b[b.length-i-1]);
            
        }
    }
}
