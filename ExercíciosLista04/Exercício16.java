/*16. Criar um vetor A com 10 elementos inteiros. Escrever um programa que 
calcule e escreva:
a) a soma de elementos armazenados nesta matriz que são inferiores a 15;
b) a quantidade de elementos armazenados na matriz que são 
iguais a 15; e c) a média dos elementos armazenados na matriz que são superiores
a 15.
 */
package ExercíciosLista04;

/**
 *
 * @author Maicon
 */
public class Exercício16 {
    public static void main(String[] args) {
        int a[]=new int [10],b=0,c=0,e=0; double d=0;
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*30);
            if (a[i]<15) {
                b=b+a[i];
            }else if (a[i]==15){
            c++;
        }else{
                d=d+a[i];
                e++;
                
            }
            System.out.println(a[i]);
        }d=d/e;
        System.out.printf("Soma: %d\nQuantidade: %d\nMédia %f\n",b,c,d);
    
    }
}
