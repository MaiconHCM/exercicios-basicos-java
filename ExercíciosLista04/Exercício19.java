/*19. Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as
notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. Escreva um
programa que calcule a média aritmética simples das notas informadas armazenando
o resultado em um vetor “Resul” de mesmo tipo e tamanho. Ao mostrar os
resultados exibir a situação de cada aluno. Se a média calculada for superior ou
igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.
 */
package ExercíciosLista04;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício19 {
    public static void main(String[] args) {
        double a[]=new double [10],b[]=new double [10],c[]=new double [10];
        Scanner ler=new Scanner (System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Informe a nota 1 do aluno "+i);
            a[i]= ler.nextInt();
            
        }for (int i = 0; i < b.length; i++) {
            System.out.println("Informe a nota 2 do aluno "+i);
            b[i]= ler.nextInt();
        }for (int i = 0; i < c.length; i++) {
            c[i]=(a[i]+b[i])/2;
            System.out.printf("Aluno %d  Média: %f  Situação: ",i,c[i]);
            if (c[i]>=7) {
                System.out.println("Aprovado");
        }else{
                System.out.println("Reprovado");
            }
        }
    }
}
