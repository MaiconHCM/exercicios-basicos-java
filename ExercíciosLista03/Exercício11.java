/*11. Fulano tem 1,50 metro e cresce 2 centímetros por ano, enquanto Ciclano tem
1,10 metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e 
imprima quantos anos serão necessários para que Ciclano seja maior que Fulano.*/
package ExercíciosLista03;

/**
 *
 * @author Maicon
 */
public class Exercício11 {
    public static void main(String[] args) {
     double a=1.50,b=1.10;int c=0;
     while(true){
     a=a+0.02;
     b=b+0.03;
     c++;
     if (b>a){
         break;
     }System.out.println("No ano "+c+"\nAltura a:"+a+" enquanto altura b:"+b);
     }System.out.println("O ciclano será maior que fulano em "+c+" anos");
    }
}
