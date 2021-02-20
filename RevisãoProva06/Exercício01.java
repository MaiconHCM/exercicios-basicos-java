/*Desenvolver um programa que alimente aleatoriamente, com números no intervalo 
de 0 até 5, dois vetores: A e B com 10 elementos cada e a seguir realize a 
seguinte verificação:
A[1] = B[10]
A[2] = B[9]
...
A[9] = B[2]
A[10] = B[1]
Se pelo menos 30% das comparações forem verdadeiras o programa deverá afirmar 
esta situação através da seguinte mensagem: “Situação verificada.”, caso 
contrário, o programa deverá informar ao usuário final com a seguinte mensagem: 
“Situação não foi verificada.
 */
package RevisãoProva06;

/**
 *
 * @author Maicon
 */
public class Exercício01 {

    public static void main(String[] args) {
        int a[] = new int[10], b[] = new int[10];
        double c = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 5);
            b[i] = (int) (Math.random() * 5);
            System.out.printf("A[%d]=%d  B[%d]=%d  ", i, a[i], i, b[i]);
            if (a[i] == b[i]) {
                c++;
                System.out.print(c + "° número igual\n");
            } else {
                System.out.println();
            }

        }
        c = (((double) a.length / 100) * c) * 100;
        if (c >= 30) {
            System.out.println("Situação verificada");
        } else {
            System.out.println("Situação não verificada");
        }
    }
}
