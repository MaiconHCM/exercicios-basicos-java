/*2. Números palíndromos são aqueles que escritos da direita para a esquerda têm
o mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987; 
97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 
10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor 
e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim 
por diante até verificar todos os elementos ou chegar a conclusão que o vetor 
não é um palíndromo.
 */
package ExercíciosLista05;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
    int a[]=new int [10],b[]=new int [10];
    Scanner ler=new Scanner (System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Insira o "+(i+1)+"° número");
            a[i]=ler.nextInt();
            b[9-i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            if(a[i]!=b[i]){
                System.out.println("Não é palindromo");
                break;
            }else if(i==b.length){
                System.out.println("É palindromo");
            }
                
            
        }
        
    }
}
