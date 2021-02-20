/*11. Criar um vetor A com 10 elementos inteiros. Implementar um programa que 
defina e escreva a quantidade de elementos armazenados neste vetor que são 
pares.
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício11 {
    public static void main(String[] args) {
        int a[]=new int [10],b=0;
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random ()*100);
            if (a[i]%2==0){
                b++;
            }
            System.out.printf("%d\n",a[i]);
            
        }System.out.println("Total de "+b+" números pares");
    }
    
}
