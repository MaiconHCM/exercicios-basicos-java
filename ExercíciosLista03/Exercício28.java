/*28. Escreva um algoritmo que calcule o valor de H, sendo que ele é determinado
pela série:
H = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50*/
package ExercíciosLista03;

public class Exercício28 {
    public static void main(String[] args) {
        double a=1,c,d=0;
        for (int i = 1; i <= 50; i++) {
            c=a/i;
            a=a+2;
            d=d+c;
            System.out.println(""+d);
        }
    }
    
}
