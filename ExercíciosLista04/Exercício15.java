/*15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que 
defina o percentual de elementos pares e ímpares, respectivamente, armazenados 
neste vetor.
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício15 {
    public static void main(String[] args) {
        int a[]=new int [10],b=0; double par=0,impar=0;
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*100);
            b=b+a[i];
            if (a[i]%2==0) {
                par=par+a[i];
            }else{
            impar=impar+a[i];
            }
             
        }System.out.println("Total: "+b+ " Pares: "+par+" Impares: "+impar);
        par=(((double)1/b)*par)*100;
        impar=(((double)1/b)*impar)*100;
        System.out.println("percentual pares: "+par+"\npercentual impar: "+impar);
    }
}
