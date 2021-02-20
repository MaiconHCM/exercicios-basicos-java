/*12. Criar um vetor A com 10 elementos inteiros. Implementar um programa que 
defina e escreva a soma de todos os elementos armazenados neste vetor.
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício12 {
    public static void main(String[] args) {
      int a[]=new int [10],b=0;
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*100);
            b=b+a[i];
            System.out.println(""+a[i]); 
        }System.out.println("Soma total "+b);
    }
}
