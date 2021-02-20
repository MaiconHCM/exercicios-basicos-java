/*17. Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um
programa que realize a interseção  dos vetores A e B para produzir um vetor C. 
Interseção de conjuntos = todos os elementos que existem em A e também existem 
em B.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício17 {
    public static void main(String[] args) {
        int a[]=new int[10],b[]=new int[10],c[]=new int[10],d=0;
        for (int i = 0; i < c.length; i++) {
            a[i]= (int) (Math.random()*10);
            b[i]= (int) (Math.random()*10);
            
        }for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (a[i]==b[j]) {
                    c[d]=a[i];
                    d++;
                    break;
                }
            
        }
        System.out.printf("A[%d]=%d  B[%d]=%d  c[%d]=%d\n",i,a[i],i,b[i],i,c[i]);    
        }
        
    }
}
