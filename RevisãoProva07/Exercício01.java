/*Desenvolver um programa que alimente aleatoriamente (no intervalo de 1 até 50)
um vetor com 15 elementos inteiros, e a seguir realize os seguintes cálculos:
a. somar os números armazenados no vetor que são múltiplos de 5;
b. contar quantos elementos do vetor são menores que 10;
c. o valor médio de todos os elementos armazenados no vetor.
Escrever o vetor A e valores calculados nos itens a, b e c. 
 */
package RevisãoProva07;

public class Exercício01 {
    public static void main(String[] args) {
     int v[]=new int [15],a=0,b=0,c=0;
        for (int i = 0; i < v.length; i++) {
            v[i]= (int) (Math.random()*50);
            if(v[i]%5==0){
                a=a+v[i];
            }if (v[i]<10) {
                b++;
            }
            c=c+v[i];
            System.out.println(v[i]);
        }System.out.println("soma dos números armazenados no vetor que são múltiplos de 5: "+a);
        System.out.println("Quantidade de elementos do vetor são menores que 10: "+b);
        System.out.println("O valor médio de todos os elementos armazenados no vetor: "+((int)c/v.length));
    }
}
