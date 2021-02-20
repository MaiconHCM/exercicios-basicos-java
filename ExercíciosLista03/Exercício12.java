/*12. Fulano aplicou R$ 100,00 com rendimento de 5% ao mês.  Quantos meses serão
necessários para o capital investido ultrapasse a R$ 200,00.*/
package ExercíciosLista03;

public class Exercício12 {
    public static void main(String[] args) {
        double a=100,c;int b=0;
   
        while(true){
        c=a/100;
        c=c*5;
        a=a+c;
        b++;
            System.out.println("No mês "+b+" você terá "+a);
        if(a>200){
            break;
        }
        }System.out.println("Demorara "+b+" para alcançar 200 R$");
    }
}
