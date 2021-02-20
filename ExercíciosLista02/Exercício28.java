/*28. Faça um algoritmo que calcule a média aritmética simples de um aluno, a 
partir de suas 3 notas obtidas no curso. Mostre, ao final, a mensagem: 
“A MEDIA FINAL FOI ...” . Informar também se o aluno foi aprovado, mostrando a 
mensagem “APROVADO” caso a média final seja maior ou igual a 7; “RECUPERAÇÃO” 
caso a média final esteja no intervalo de 5 até 7 e “REPROVADO” caso a média 
final seja menor que 5.
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício28 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double a,b,c;
        System.out.println("Informe a primeira nota");
        a=ler.nextDouble();
        System.out.println("Informe a segunda nota");
        b=ler.nextDouble();
        System.out.println("Informe a terceira nota");
        c=ler.nextDouble();
        a=(a+b+c)/3;
        System.out.println("Média final foi: "+a);
        if (a>=7) {
            System.out.println("Aprovado");
        }else if (a>=5){
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
