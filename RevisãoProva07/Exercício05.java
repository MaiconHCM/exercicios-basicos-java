/*Dado um conjunto A de 10 números inteiros. Pede-se para escrever um programa 
que crie um vetor B, também com 10 números, obedecendo a seguinte regra de 
formação: B[i] = A[i] x i / Peso, para todo "i" variando de 1 até 10 e o "Peso" 
começando de 1,5 e crescendo de 0,5 a cada passo.
 */
package RevisãoProva07;

public class Exercício05 {
    public static void main(String[] args) {
        int a[]=new int[10];double peso=1.5,b[]=new double[10];
        for (int i = 0; i < b.length; i++) {
            a[i]=(int) (Math.random()*100);
            b[i]=a[i]*(i+1)/peso;
            peso=peso+0.5;
            System.out.printf("B[%d] = A[%d] x %d / %f    B[%d]=%f\n",i,i,(i+1),peso,i,b[i]);
        }
    }
  
}
