/*29. Elabore um algoritmo que determine o valor de S, onde:
S = 1/1 - 2/4 + 3/9 - 4/16 + 5/25 - 6/36 + ... - 10/100*/
package ExercíciosLista03;

public class Exercício29 {
    public static void main(String[] args) {
        double a,b=0,c;
        for (int i = 1; i <= 10; i++) {
            a=i*i;
            c=i/a;
            if (i%2==0) {
                b=b-c;
            }
            else{
                b=b+c;
            }
        }System.out.println(""+b);
    }
    
}
