/*2 - O Índice de Massa Corporal (IMC) é uma fórmula que indica se um adulto 
está acima do peso, se está obeso ou abaixo do peso ideal considerado saudável.
A fórmula para calcular o Índice de Massa Corporal é:
IMC := peso / (altura)2
A Organização Mundial de Saúde usa um critério simples para considerar quem está
acima do peso e quem é obeso:
IMC calculado		Situação
Menos de 20		Abaixo do peso
20 ≤ IMC < 25		Peso Normal
25 ≤ IMC < 30		Acima do peso
30 ≤ IMC < 34		Obeso
Acima de 34                    	Muito Obeso
Desenvolva um programa que leia o peso (em kg, tipo int ) e altura (em metros, 
tipo double) e em seguida calcule o IMC e mostre qual a situação do adulto de 
acordo com a tabela acima. 
 */
package RevisãoProva03;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício02 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a;double b,IMC;
        System.out.println("Informe o peso:");
        a=ler.nextInt();
        System.out.println("Informe a altura:");
        b=ler.nextDouble();
        IMC=a/(b*b);
        System.out.println("Seu IMC é "+IMC);
        if (IMC<20){
            System.out.println("Abaixo do peso");
        }
        else if (IMC<25){
            System.out.println("Peso normal");
                }
        else if (IMC<30){
            System.out.println("Acima do peso");
        }else if (IMC<34){
            System.out.println("Obeso");
        }else {
            System.out.println("Muito obeso");
        }
    }
}
