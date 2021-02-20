
package Aulas_Período01;

import java.util.Scanner;

public class Exemplo2FOR {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b,c,d;
        //Contagem de 10 até 100
        for (int i=10;i>=1;i--){
            System.out.println("1:"+i);
        }
        //de 20 a 43
        for (int i = 20; i <= 43; i+=2) {
            System.out.println("2:"+i);
        }//de 1 a  5 passo 0.
        for (double i = 1; i <= 5; i+=0.6) {
            System.out.println("3:"+i);
        }System.out.println("Valor inicial");
        a=ler.nextInt();
        System.out.println("Valor final");
        b=ler.nextInt();
        System.out.println("Atualização");
        c=ler.nextInt();
        for (int i = a; i <= b; i+=c) {
            System.out.println("4:"+i);
        }
    }
}
