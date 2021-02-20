/*Dados dois vetores A e B com 10 números inteiros cada (definidos de forma 
aleatória no intervalo de 100 até 200, inclusive). Escrever um programa que gere
um vetor C, também com tamanho igual 10, obedecendo as seguintes regras de 
formação:
C[i] = A[i]	quando A[i] for maior que B[i]
C[i] = 0		quando A[i] for igual a B[i]
C[i] = B[i]	quando A[i] for menor que B[i]
Para todo i variando de 1 até 10. Escrever os vetores A, B e C.
 */
package RevisãoProva07;

public class Exercício04 {
    public static void main(String[] args) {
    int a[]=new int[10],b[]=new int[10],c[]=new int[10];
        for (int i = 0; i < c.length; i++) {
            a[i]= (int) (Math.random()*100)+100;
            b[i]= (int) (Math.random()*100)+100;
            if (a[i]>b[i]) {
                c[i]=a[i];
            }else if (a[i]==b[i]){
                c[i]=0;
        }else{
                c[i]=b[i];
            }
            System.out.printf("A[%d]=%d B[%d]=%d C[%d]=%d\n",i,a[i],i,b[i],i,c[i]);
    
    }}
}
