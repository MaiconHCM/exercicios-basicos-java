/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercícioListaExtra02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício03 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a,b=0,c=0,f=0,e; double d,g;
        System.out.println("Informe a quantidade de alunos:");
        e=ler.nextInt();
        for (int i = 1; i <= e; i++) {
            f++;
            System.out.println("Informe sexo:(1 para masc e 2 para fem");
            a=ler.nextInt();
            if (a==2){
                b++;
            }
            System.out.println("Informe a idade:");
            a=ler.nextInt();
            if (a<18){
              c=a+c;
            }
        }d=((double)b/f)*100;
        g=(double)c/f;
        System.out.println(d+"% dos alunos são mulheres\nA média de idade com "
                + "menos de 18 anos é de "+g);
    }
}
