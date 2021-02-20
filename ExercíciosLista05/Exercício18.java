/*18. Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver um
programa que crie um vetor C que é a diferença dos conjuntos formados pelos 
elementos dos vetores A e B. Diferença de conjuntos = todos os elementos do 
conjunto A que não existem no conjunto B.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício18 {
    public static void main(String[] args) {
        int a[]=new int[10],b[]=new int[10],c[]=new int[10],d=0;
        for (int i = 0; i < c.length; i++) {
            a[i]= (int) (Math.random()*10);
            b[i]= (int) (Math.random()*10);
            
        }for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (a[i]==b[j]) {
                    break;
                }else if ((a[i]!=b[j])&&(j==c.length-1)){
                    c[d]=a[i];
                    d++;
                    break;
                }
            
        }
        System.out.printf("A[%d]=%d  B[%d]=%d  c[%d]=%d\n",i,a[i],i,b[i],i,c[i]);    
        }
    }
}
