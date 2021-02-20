/*32. Elabore um programa que leia o dia e o mês de nascimento de uma pessoa e 
determine o seu signo conforme a tabela a seguir:
 */
package ExercíciosLista02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício32 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b;
        System.out.println("Informe o dia do nascimento");
        a=ler.nextInt();
        System.out.println("informe o mês de nascimento");
        b=ler.nextInt();
        if (((a>=22)&&(b==12))||((a<=20)&&(b==1))){
            System.out.println("Capricórnio");
    }else if(((a>=21)&&(b==1))||((a<=19)&&(b==2))){
            System.out.println("Aquário");
    }else if (((a>=20)&&(a==2))||((a<=20)&&(b==3))){
            System.out.println("Peixes");
    }else if (((a>=21)&&(a==3))||((a<=20)&&(b==4))){
            System.out.println("Áries");
    }else if (((a>=21)&&(a==4))||((a<=20)&&(b==5))){
            System.out.println("Touro");
    }else if (((a>=21)&&(a==5))||((a<=20)&&(b==6))){
            System.out.println("Gêmeos");
    }else if (((a>=21)&&(a==6))||((a<=21)&&(b==7))){
            System.out.println("Câncer");
    }else if (((a>=22)&&(a==7))||((a<=22)&&(b==8))){
            System.out.println("Leão");
    }else if (((a>=23)&&(a==8))||((a<=22)&&(b==9))){
            System.out.println("Virgem");
    }else if (((a>=23)&&(a==9))||((a<=22)&&(b==10))){
            System.out.println("Libra");
    }else if (((a>=23)&&(a==10))||((a<=20)&&(b==11))){
            System.out.println("Escorpião");
    }else{
            System.out.println("Sagítario");
    }
    }
}
