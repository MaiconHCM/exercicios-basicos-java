/*7. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo 
este a junção dos dois outros vetores. Os primeiros 10 elementos de C deverão 
receber os elementos de A e os últimos elementos C deverão receber os elementos 
de B. Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 
elementos.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício07 {
    public static void main(String[] args) {
      int a[]=new int[10], b[]=new int[10],c[]=new int [a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*100);
            b[i]=(int) (Math.random()*100);
            c[i]=a[i];
            c[b.length+i]=b[i];
            System.out.printf("c[%d]=%d c[%d]=%d\n",i,c[i],a.length+i,c[a.length+i]);
        }
    }
}
