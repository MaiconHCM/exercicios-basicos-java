/*Fazer um programa que calcule a quantidade de divisores dos números
compreendidos entre o valor ‘x’ informado pelo usuário e ‘x+10’, inclusive.
Escreva cada número entre ‘x’ e ‘x+10’ e a quantidade de divisores 
correspondentes.
Ao final do processo repetitivo escrever qual foi a maior quantidade de 
divisores.
Veja a sugestão ao lado. 
Precisa ter um for que vai do limite inicial até o limite inicial + 10 e outro 
que vai de 1 até o i.
 */
package RevisãoProva05;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe o valor inicial");
        int a,b,c=0,d=0;
        a=ler.nextInt();
        for (int i = a; i <= a+10; i++) {
            System.out.print(i+" - ");
            b=0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    System.out.print(j+", ");
                    b++;
                }
            }System.out.print("quantidade de divisores: "+b);
            if (b>c){
                c=b;
                d=i;
            }
            System.out.println("");
        }System.out.println("Número "+d+" possui mais divisores, quantidade:"+c);
    }
}
