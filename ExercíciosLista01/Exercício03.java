/*3.	Uma conta telefônica é composta dos seguintes custos: 
assinatura: R$ 32,00 
impulsos: R$ 0,09 por impulso que exceder a 90 
chamadas p/ celular: R$0,35 por impulso
Escreva um programa que monte a fórmula para calcular o valor da conta para 254
impulsos e 23 chamadas para celular imprimindo o resultado obtido.
*/
package ExercíciosLista01;
public class Exercício03 {
    public static void main(String[] args) {
        double a,b,c,d;
        a=254-90;
        b=a*0.09;
        c=23*0.35;
        d=b+c+32.00;
        System.out.println("valor a pagar é de "+d);
    }
}
