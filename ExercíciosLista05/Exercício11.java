/*11. Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
imprima cada elemento do vetor A e uma mensagem indicando se o respectivo 
elemento é um número primo ou não.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício11 {
    public static void main(String[] args) {
        int a[]=new int[10]; boolean primo=false;
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*20);
            System.out.print(a[i]);
            primo=true;
            for (int j = 2; j < a[i]; j++) {
                if ((double)a[i]%j==0) {
                    System.out.println(" não é primo");
                    primo=false;
                    break;
                }
                
                
            }if(primo==true){
                System.out.println(" é primo");
            }
            
        }
    }
 
}
