/*Desenvolver um programa que leia  a idade de um grupo de pessoas.O processo de
entrada de dados é encerrado quando o usuário digitar -1 para a idade.

Os seguintes resultados deverão ser exibidos:
a quantidade de pessoas com idade entre 10 e 18 anos (inclusive);
idade média informada;
a idade da pessoa mais velha.
*/
package ExercícioListaExtra01;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b=0,c=0,e=0,f=0; double d;
    while(true){
        System.out.println("Informe a idade (-1 sai)");
        a=ler.nextInt();
        if(a<0){
            break;
        }
        c=a+c;
        e++;
        if ((a<18)&&(a>10)) {
            b++;
        }
        if (a>f){
            f=a;
        }
        
    }d=c/e;
        System.out.println(b+" com idade entre 10 e 18 anos \nIdade média:"+d
        +"\nPessoa mais velha:"+f);    
    }
}
