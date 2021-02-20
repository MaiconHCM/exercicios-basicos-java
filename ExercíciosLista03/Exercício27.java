/*27. Escreva um algoritmo que calcule o valor de T, sendo que ele é determinado
pela série:
T = 1/50 + 2/49 + 3/48 + 4/47 + 5/46 + 6/45 + 7/44 + 8/43 + 9/42 + 10/41.
 */
package ExercíciosLista03;
public class Exercício27 {
    public static void main(String[] args) {
        double a=50,b=0,c=0;
        for (int i = 1; i <= 10; i++) {
            a=a--;
            b=i/a;
            c=b+c;
            System.out.println(""+c); 
        }
    }
   
}
