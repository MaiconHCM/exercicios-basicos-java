/*Fazer um programa que calcule o fatorial dos números inteiros de 2 até 10.
A forma de exibir os resultados deve ser  similar a figura a seguir. Precisa de 
2 for também.
 */
package RevisãoProva05;


public class Exercício06 {
    public static void main(String[] args) {
        int a;
        for (int i = 2; i <= 10; i++) {
            System.out.print(i+"! = ");
            a=i;
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                if (j!=1){
                    System.out.print(" * ");
                    a=a*(j-1);
                }
                
                
            }System.out.print(" = "+a);
            System.out.println("");
        }
    }
    
}
