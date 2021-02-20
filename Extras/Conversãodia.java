package Extras;
import java.util.Scanner;
public class Conversãodia {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        long dias,horas,minutos,segundos;
        System.out.println("Escreva a quantidade de dias desejado");
        dias=ler.nextLong();
        horas=dias*24;
        minutos=horas*60;
        segundos=minutos*60;
        System.out.println(dias+" dias que são");
        System.out.println(horas+" horas que são");
        System.out.println(minutos+" minutos que são");
        System.out.println(segundos+" segundos");
    }
}
