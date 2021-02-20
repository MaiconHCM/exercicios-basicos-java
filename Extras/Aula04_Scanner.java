package Extras;
import java.util.Scanner;
/*esse setor é importante para puxarmos comandos e pacotes, caso quiser puxar
todos os pacotes escreva import java.util.*  */
public class Aula04_Scanner {
    public static void main(String[]args){
        Scanner input/*pode ser qualquer nome */= new Scanner(System.in);
        double area, altura, base;
        System.out.println("Informe o valor da base");
        base = input.nextDouble();
        System.out.println("Informe o valor da altura");
        altura = input.nextDouble();
        area = base*altura;
        System.out.println("Valor da area do triangulo é ingual a "+area);
    }
    
}
