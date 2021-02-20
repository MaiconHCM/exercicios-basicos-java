/*9. Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A 
utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os 
elementos pares de A e nas posições restantes do vetor B armazene os elementos 
de A que são ímpares.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício09 {
    public static void main(String[] args) {
       int a[]=new int[20],b[]=new int [20],ct=0;
        for (int i = 0; i < b.length; i++) {
            a[i]=(int) (Math.random()*100);
            if (a[i]%2==0){
                b[ct]=a[i];
                ct++;
            }
            
        }for (int i = 0; i < b.length; i++) {
            if (a[i]%2!=0) {
            b[ct]=a[i];
            ct++;
        }System.out.printf("A[%d]=%d   B[%d]=%d\n",i,a[i],i,b[i]);
            
        }
    }
 
}
