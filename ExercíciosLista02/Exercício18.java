/*18. Uma faculdade classifica as notas dos alunos conforme a seguinte tabela: 
 */
package ExercíciosLista02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota;
        System.out.println("Informe a nota:");
        nota = ler.nextDouble();
        if (nota == 0) {
            System.out.println("Sem rendimento");
        } else if ((nota >= 0.1) && (nota <= 2.9)){
        System.out.println("Inferior");
        }else if ((nota>=3)&&(nota<=4.9)){
            System.out.println("Médio inferior");
        }else if ((nota>=5)&&(nota<=6.9)){
            System.out.println("Médio");
        }else if ((nota>=7)&&(nota<=8.9)){
            System.out.println("Médio superior");
        }else if ((nota>=9)&&(nota<=9.9)){
            System.out.println("Superior");
        }else {
            System.out.println("Máximo");
        }
    
    }
}
