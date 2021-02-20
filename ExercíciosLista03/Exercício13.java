/*13. Fulano realizou um empréstimo bancário de R$ 10.000,00 que deverão ser 
pagos em 24 meses com juros de 2% ao mês, incluídos já na primeira parcela.
Determine e apresente o valor da última parcela e o montante pago ao final do 
empréstimo.*/
package ExercíciosLista03;

public class Exercício13 {
    public static void main(String[] args) {
        double a=10000,b;
        for (int i = 1; i <= 24; i++) {
           b=a*0.02;
           a=b+a;
            System.out.println("No mês "+i+" devera ser pago "+a);
        }
    }
    
}
