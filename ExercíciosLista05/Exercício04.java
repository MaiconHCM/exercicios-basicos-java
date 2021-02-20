/*4. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um 
vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
a) Ci deverá receber 1 quando Ai for maior que Bi; b) Ci deverá receber 0 quando
Ai for igual a Bi; c) Ci deverá receber -1 quando Ai for menor que Bi.
 */
package ExercíciosLista05;

/**
 *
 * @author Maicon
 */
public class Exercício04 {
    public static void main(String[] args) {
        int a[]=new int[10],b[]=new int[10],c[]=new int[10];
        for (int i = 0; i < c.length; i++) {
            a[i]=(int) (Math.random()*5);
            b[i]=(int) (Math.random()*5);
            if(a[i]>b[i]){
                c[i]=1;
            }else if(a[i]==b[i]){
                c[i]=0;
            }else{
                c[i]=-1;
            }
            System.out.printf("A[%d]=%d  B[%d]=%d  C[%d]=%d\n",i,a[i],i,b[i],i,c[i]);
        }
    }
}
