/*21. Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1
, sugestão: A[i] = (int)Math.random()*2; Pede-se para implementar um programa 
que determine o percentual de números 0's e 1's existentes no vetor A.
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício21 {
    public static void main(String[] args) {
    int a[]=new int[10];double b=0,c=0;
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*2);
            if (a[i]==0){
                b++;
                
            }else{
               c++;
               
            }
            System.out.println(""+a[i]);
        }b=(((double)1/10)*b)*100;
        c=(((double)1/10)*c)*100;
        System.out.println("porcentagem de 0: "+b);
        System.out.println("porcentagem de 1: "+c);
    }
   
}
