/*24. Elaborar um programa que determine a potência de um número. O usuário 
informa a base e o expoente e o programa informa o resultado da base elevada ao 
expoente. Não podem ser utilizadas funções prontas do C para fazer o cálculo da 
potência, deve ser construído o algoritmo para isso. Por exemplo, o usuário 
informa 2 para base e 5 para expoente e o programa informa que o resultado é 32.
Ou seja, 25 = 2 X 2 X 2 X 2 X 2 = 32.*/
package ExercíciosLista03;

import java.util.Scanner;

public class Exercício24 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a,b,c=1;
        System.out.println("Informe a base");
        a=ler.nextInt();
        System.out.println("Informe o expoente");
        b=ler.nextInt();
        for (int i = 1; i <= b; i++) {
            c=c*a;
            
        }System.out.println(a+" elevado a "+b+" é igual a "+c);
    }
}
