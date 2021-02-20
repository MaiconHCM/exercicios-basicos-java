/*Faça um algoritmo para corrigir provas de múltipla escolha. Cada prova tem 10 
questões, cada questão valendo um ponto. O primeiro conjunto de dados a ser lido
será o gabarito para a correção da prova. Os outros dados serão os números de 
inscrição dos alunos e suas respectivas respostas. O algoritmo deverá calcular e
imprimir, para cada aluno, o seu número de inscrição e sua nota.
Sugestão: Crie um vetor para armazenar o gabarito da prova e um vetor para 
armazenar as respostas para cada aluno.
 */
package RevisãoProva07;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício03 {
    public static void main(String[] args) {
        int a[]=new int [10],b[]=new int [10],c=0;
        Scanner ler=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            
            a[i]= (int) (Math.random()*5);
            
            System.out.println("Gabarito questão "+i+" é "+a[i]);
            
        }while (true){
            System.out.println("Insira o número do aluno");
            c=ler.nextInt();
            if (c<=0) {
            break;
        }
            c=0;
            System.out.println("Prova aluno "+c+"");
        for (int i = 0; i < b.length; i++) {
            b[i]= (int)    (Math.random()*5);
            System.out.print("Respondeu "+b[i]);
            if(b[i]==a[i]){
            System.out.println(", a questão "+i+" está correta ");
            c++;
            }else{
            System.out.println(", a questão "+i+" está incorreta ");      
            }
            
        }System.out.println("Nota desse aluno: "+c);
            
        }
    }
}
