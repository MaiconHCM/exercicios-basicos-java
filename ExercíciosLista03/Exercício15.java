/*15. Apresentar todos os valores numéricos inteiros pares situados na faixa de
1000 a 1500.*/
package ExercíciosLista03;

public class Exercício15 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 1500; i++) {
            if (0==i%2){
                System.out.println(""+i);
            }
        }
    }
}
