/*14. Criar um vetor A com 10 elementos inteiros. Implementar um programa que 
defina e escreva a média aritmética simples dos elementos ímpares armazenados 
neste vetor.
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício14 {
    public static void main(String[] args) {
        int a[]=new int[10],b=0; double c=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*100);
            if (a[1]%2!=0) {
                b++;
                c=c+a[i];
            }
            
        }System.out.println("Média é "+(c/b));
    }
}
