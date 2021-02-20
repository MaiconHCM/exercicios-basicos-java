/*30. Escreva um algoritmo que calcule e escreva a soma dos dez primeiros termos
da seguinte série:
2/500 – 5/450 + 2/400 – 5/350 + ...*/
package ExercíciosLista03;
public class Exercício30 {
    public static void main(String[] args) {
        double a=2,b,c=0;
        for (int i = 500; i >= 0; i-=50) {
            b=a/i;
            if (a==2) {
                a=a+3;
                c=c-b;
            }else{
                a=a-3;
                c=c+b;
            }
            System.out.println(""+c);}
    
    }
}
