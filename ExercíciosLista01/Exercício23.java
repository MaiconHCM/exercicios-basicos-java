/*23.	Efetuar a leitura de um número inteiro longo (long) que representa um 
tempo em segundos e convertê-lo para dias, horas, minutos e segundos.*/
package ExercíciosLista01;

import java.util.Scanner;

public class Exercício23 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int dias,horas,minutos,segundos;
        System.out.println("Informe o segundos desejados");
        segundos=ler.nextInt();
        dias=segundos/86400;
        segundos=segundos%86400;
        horas=segundos/3600;
        segundos=segundos%3600;
        minutos=segundos/60;
        segundos=segundos%60;
        System.out.println("Dias:"+dias+"\nHoras:"+horas+"\nMinutos:"+
                minutos+"\nSegundos:"+segundos);
    }
    
}
