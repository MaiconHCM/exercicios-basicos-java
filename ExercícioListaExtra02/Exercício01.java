
package ExercícioListaExtra02;

import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
    Scanner ler=new Scanner (System.in);
    double a,b,c=0,f=0; int d,e=0;
    while(true){
        System.out.println("Informe o codigo de produto:");
        d=ler.nextInt();
        if (d<0){
            break;
        }
        System.out.println("Informe o preço de custo:");
        a=ler.nextDouble();
        b=(a*1.2);
        e++;
        c=a+c;
        f=b+f;
        System.out.println("Código:"+d+"\npreço atual:"+a+"\ncom aumento:"+b);
    }
            System.out.println("Média sem aumento:"+(c/e)+"\nsem aumento"+(f/e));
    }
}
