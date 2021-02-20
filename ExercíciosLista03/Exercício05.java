/*5. Apresentar todos os números da sequência a seguir: 0, 0.25, 0.5, 0.75, 1.0,
1.25, 1.5, 1.75, 2.0, 2.25, 2.5, 2.75, 3.0, 3.25, 3.5, 3.75, 4.0. */
package ExercíciosLista03;

public class Exercício05 {
    public static void main(String[] args) {
        for (double i = 0; i <= 4; i+=0.25) {
            System.out.println("Número "+i);
        }
    }
    
}
