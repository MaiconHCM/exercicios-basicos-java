/*1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo 
tipo e tamanho e com os “mesmos” elementos do vetor A.
 */
package ExercíciosLista04;

public class Exercício01 {
    public static void main(String[] args) {
    int a[]=new int [8];
        int b[]=new int [8];
        
        for (int i = 0; i < a.length; i++) {
            a[i] =(int) (Math.random()*30);
            
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=a[i];
            
        }for (int i = 0; i < b.length; i++) {
            System.out.printf("a[%d] = %d b[%d] = %d\n",i,a[i],i,b[i]);
            
         }
        }
    }
