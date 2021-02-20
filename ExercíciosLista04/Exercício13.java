/*13. Criar um vetor A com 10 elementos inteiros. Implementar um programa que 
determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício13 {
    public static void main(String[] args) {
    int a[]=new int[10],b=0;
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*100);
            if(a[i]%5==0) {
                b=b+a[i];
            }
            
        }System.out.println("Soma de todos "+b);

    
    }
    
}
