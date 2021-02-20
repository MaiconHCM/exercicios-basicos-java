/*21. Escrever um programa, que leia valores inteiros até ser lido o valor -1.
Quando isso acontecer o programa deverá escrever a soma e a média dos valores 
lidos.*/
package ExercíciosLista03;

import java.util.Scanner;


public class Exercício21 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b=0,c=0;
        while (true){
        System.out.println("Informe um valor inteiro(-1 para sair):");
        a=ler.nextInt();
            if (a<=-1) {
                break;
                
            }
            b++;
            c=c+a;
        }int d;
        d=c/b;
        System.out.println("Soma total:"+c);
        System.out.println("Média é:"+d);
        
        }
    }
