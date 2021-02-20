package Aulas_Período01;
import java.util.Scanner;
public class Aula1003Sequencia {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int vlr,n100,n50,n20,n10,n5,n2,n1;
        System.out.println("Porfavor Informe o valor");
        vlr=ler.nextInt();
        n100=vlr/100;
        vlr=vlr%100;
        n50=vlr/50;
        vlr=vlr%50;
        n20=vlr/20;
        vlr=vlr%20;
        n10=vlr/10;
        vlr=vlr%10;
        n5=vlr/5;
        vlr=vlr%5;
        n2=vlr/2;
        vlr=vlr%2;
        n1=vlr/1;
        vlr=vlr%1;
        System.out.println("notas de 100 necessarias:"+n100);
        System.out.println("Notas de 50 necessarias:"+n50);
        System.out.println("Notas de 20 necessarias:"+n20);
        System.out.println("Notas de 10 necessarias:"+n10);
        System.out.println("Notas de 5 necessarias"+n5);
        System.out.println("Notas de 2 necessarias"+n2);
        System.out.println("Notas de 1 necessarias"+n1);
    }
}
