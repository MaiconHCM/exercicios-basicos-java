/*15. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo 
tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento 
correspondente em A.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício15 {
    public static void main(String[] args) {
        int a[]=new int[15], b[]=new int[15];
        for (int i = 0; i < b.length; i++) {
            a[i]=(int) (Math.random()*10)+2;
            System.out.printf("a[%d]=%d (%d",i,a[i],a[i]);
            b[i]=a[i];
            for (int j = a[i]-1; j > 0; j--) {
                System.out.print(" x "+j);
                b[i]=b[i]*j;
             
            }System.out.println(" )=" +b[i]);
        }
    }
}
