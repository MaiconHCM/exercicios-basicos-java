/*8. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que 
nos vetores B e C serão armazenados os valores pares e ímpares de A, 
respectivamente.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício08 {
    public static void main(String[] args) {
     int a[]=new int [20],b[]=new int[20],c[]=new int[20],bc=0,cc=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*100);
            System.out.printf("A[%d]=%d  ",i,a[i]);
            if (a[i]%2==0) {
                b[bc]=a[i];
                System.out.printf("B[%d]=%d\n",bc,b[bc]);
                 bc++;
            }else{
                c[cc]=a[i];
                System.out.printf("C[%d]=%d\n",cc,c[cc]);
                cc++;
            }
            
        }
    }
}
