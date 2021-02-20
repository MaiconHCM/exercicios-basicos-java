//26.Efetuar a leitura de um número inteiro e apresentar a tabuada deste número.
package ExercíciosLista01;

import java.util.Scanner;

public class Exercício26 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int v,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
        System.out.println("Informe o número desejado:");
        v=ler.nextInt();
        t1=v*1;
        t2=v*2;
        t3=v*3;
        t4=v*4;
        t5=v*5;
        t6=v*6;
        t7=v*7;
        t8=v*8;
        t9=v*9;
        t10=v*10;
        System.out.println("A tabuada do "+v);
        System.out.println(v+"x01 = "+t1);
        System.out.println(v+"x02 = "+t2);
        System.out.println(v+"x03 = "+t3);
        System.out.println(v+"x04 = "+t4);
        System.out.println(v+"x05 = "+t5);
        System.out.println(v+"x06 = "+t6);
        System.out.println(v+"x07 = "+t7);
        System.out.println(v+"x08 = "+t8);
        System.out.println(v+"x09 = "+t9);
        System.out.println(v+"x10 = "+t10);
    }
}
