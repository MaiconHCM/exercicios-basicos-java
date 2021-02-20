/*Fazer um programa que obtenha o “expoente” e o “valor da base”. A seguir 
realize um processo de repetição do ‘expoente’ até ‘expoente+10’ a cada passo 
elevando a base ao respectivo expoente.
 */
package RevisãoProva05;

import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe o expoente:");
        int a,b,c;
        a=ler.nextInt();
        System.out.println("Informe o valor base:");
        b=ler.nextInt();
        for (int i = 0; i <= a+10; i++) {
            c=b;
            for (int j = 0; j <= i; j++) {
                c=c*b;   
                
            }System.out.println(b+" elevado a "+i+" = "+c);
        }
    }
}
