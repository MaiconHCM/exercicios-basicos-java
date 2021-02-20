/*19. Apresentar todos os valores numéricos inteiros entre 1 e 10. No final 
imprimir, separadamente, a soma dos números pares e ímpares
 */
package ExercíciosLista03;

/**
 *
 * @author Maicon
 */
public class Exercício19 {
    public static void main(String[] args) {
        int a=0,b=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(""+i);
            if (i%2==0) {
                a=a+i;
            }else{
                b=b+i;
            }
        }System.out.println("Soma de pares: "+a);
        System.out.println("Soma de impares: "+b);
        
    }
}
