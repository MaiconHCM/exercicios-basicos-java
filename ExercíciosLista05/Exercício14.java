/*14. Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada 
elemento do vetor A é formado potência de base 2 elevado ao expoente posição do 
respectivo elemento, ou seja:
A[i] = 2i. Sugestão int A[] = new [10];
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício14 {
    public static void main(String[] args) {
      int a[]=new int[11];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*100);
            
        }
    }
}
