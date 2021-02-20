/*31. A série de Fibonacci é formada pela sequência: 1, 1, 2, 3, 5, 8, 13, 21, 
34, 55, ..., etc. Escreva um algoritmo que gere a série de Fibonacci até o 
vigésimo termo.
 */
package ExercíciosLista03;


/**
 *
 * @author Maicon
 */
public class Exercício31 {
    public static void main(String[] args) {
        int a=1 ,b=1,c=1;
        
        for (int i = c; i <= 20; i++) {
           
            b=a;
            a=c;
            c=a+b;
            System.out.println(""+c);
        }
    }
}
