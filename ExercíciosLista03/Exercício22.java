/*22. Escrever um programa que receba vários números inteiros. O valor informado
-1 indica o final da leitura. No final imprimir a quantidade de números 
múltiplos de 3.*/
package ExercíciosLista03;

import java.util.Scanner;

public class Exercício22 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b=0;
        while(true){
            System.out.println("Informe o número");
            a=ler.nextInt();
            if (a<0){
                break;
            }else if(a%3==0){
                b++;
            }
            
        }System.out.println("Total de números divisiveis por 3 inseridos:"+b);
        
    }
}
