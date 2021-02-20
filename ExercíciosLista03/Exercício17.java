/*17. Apresentar a soma de todos os números divisíveis por 4 entre 40 e 200.*/
package ExercíciosLista03;
public class Exercício17 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 40; i <= 200; i++) {
            if (i%4==0){
                a=a+i;
                System.out.println(""+a);
            }
        }
    }
}
