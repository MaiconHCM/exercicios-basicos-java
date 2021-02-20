/*20. Implementar um programa que obtenha a cotação do dólar (U$) em relação ao 
real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes 
conversões:
A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
 */
package ExercíciosLista04;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício20 {
    public static void main(String[] args) {
        double a[]=new double[20],b;
        Scanner ler=new Scanner(System.in);
        System.out.println("Insira o valor da cotação");
        b=ler.nextDouble();
        System.out.println("Reais=====Dolárs");
        for (int i = 0; i < a.length; i++) {
            a[i]=b*i;
            System.out.printf("%d        %f\n",i,a[i]);
        }
            
        }
    }