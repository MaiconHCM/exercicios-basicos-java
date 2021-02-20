/*10. Criar um vetor A com 5 elementos inteiros. Escreva um programa que 
imprima a tabuada de cada um dos elementos do vetor A.
 */
package ExercíciosLista05;

public class Exercício10 {
    public static void main(String[] args) {
      int a[]=new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*100);
            System.out.println("\nTabuada do "+a[i]);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d X %d = %d\n",a[i],j,a[i]*j);
            }
            
        }
    }
}
