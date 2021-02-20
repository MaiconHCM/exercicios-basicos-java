/*21. Solicitar salário e o valor da prestação de um empréstimo pretendido.
Se prestação for maior que 20% do salário, imprimir: “Empréstimo não pode ser 
concedido”. Senão, imprimir: “Empréstimo pode ser concedido”.
 */
package ExercíciosLista02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício21 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe o salário:");
        double a,b;
        a=ler.nextDouble();
        System.out.println("Valor da prestação:");
        b=ler.nextDouble();
        a=a*1.20-a;
        if (a>=b){
            System.out.println("Empréstimo pode ser concedido");
        }else {
            System.out.println("Empréstimo não pode ser concedido");
        }
    }
}
