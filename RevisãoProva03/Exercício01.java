/*01 - Fazer um programa que calcule a quantidade de telhas que serão utilizadas
em uma obra de acordo com o modelo escolhido. Solicite ao usuário o modelo da 
telha, a largura e comprimento da casa, calcule a área e o número de telhas de 
acordo com a tabela a seguir. No final aumente em 13% o número de telhas, pois 
algumas são quebradas ou recortadas durante a colocação.
 */
package RevisãoProva03;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício01 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a;
        double e,f,g,b,c,d;
        System.out.println("Digite o modelo de telha desejado:");
        a=ler.nextInt();
        System.out.println("Informe a largura da casa:");
        b=ler.nextDouble();
        System.out.println("Informe o comprimento da casa:");
        c=ler.nextDouble();
        d=b*c;
        System.out.println("Aréa total "+d);
        if (a==1) {
            System.out.println("Telha Romana");
            e=d*16;
            System.out.println("Total de telhas:"+e);
            f=(e/100)*13;
            System.out.println("Acrescimo de 13%: "+f);
            g=f+e;
            System.out.println("Total de telhas: "+g);
        }
        else if (a==2){
            System.out.println("Telha Italiana");
            e=d*14;
            System.out.println("Total de telhas:"+e);
            f=(e/100)*13;
            System.out.println("Acrescimo de 13%: "+f);
            g=f+e;
            System.out.println("Total de telhas: "+g);
            
        }else if (a==3){
            System.out.println("Telha Colonial pequena");
            e=d*24;
            System.out.println("Total de telhas:"+e);
            f=(e/100)*13;
            System.out.println("Acrescimo de 13%: "+f);
            g=f+e;
            System.out.println("Total de telhas: "+g);
        }else{
            System.out.println("Código da telha incorreto");
        }
    }
   
}
