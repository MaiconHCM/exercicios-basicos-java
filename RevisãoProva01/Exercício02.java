/*02 - Criar um programa auxilie o gerente de uma loja de materiais de
construção no gerenciamento de suas vendas. Para tanto leia a quantidade de 
tijolos comprados e seu valor unitário, bem como a quantidade de argamassa 
comprada e o valor unitário, apresente o valor total da conta. Solicite qual 
foi o valor pago pelo cliente, calcular qual o troco a ser devolvido e informar 
na tela para o usuário. 
 */
package RevisãoProva01;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
  int tij,arg; double vlrt,vlra,vlrtot,pagc;
        System.out.println("Informe a quantidades de tijolos comprados:");
        tij=ler.nextInt();
        System.out.println("Informe valor unitario do tijolo:");
        vlrt=ler.nextDouble();
        System.out.println("Informa quanto de argamassa ele comprou");
        arg=ler.nextInt();
        System.out.println("Informe o valor unitario da argamassa");
        vlra=ler.nextDouble();
        vlrtot=tij*vlrt+arg*vlra;
        System.out.println("Informe quanto individuo pagou:");
        pagc=ler.nextDouble();
        pagc=vlrtot-pagc;
        System.out.println("o valor total é "+vlrtot+" e troco é de"+pagc);
        
    }
}
