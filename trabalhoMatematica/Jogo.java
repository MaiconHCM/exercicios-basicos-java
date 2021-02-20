/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matématica;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Jogo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira seu nome");
        String nome;
        nome = ler.nextLine();
        try {
            Thread.sleep(700);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Isso não será uma historia chata, e sim uma historia"
                + " que trará inspiração as futuras gerações do mundo!");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Então, imagine " + nome + " vivendo "
                + "sua mediocre vida");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Vestir as mesmas roupas, a mesma calça rasgada, a vida ruim"
                + " e chata de sempre... Esse era o " + nome + " antés de conhecer a matématica");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Bom, é apenas um dia normal, então você tem uma decisão...\nVocê tem 10 minutos"
                + " para sair de casa, e você tem que racionar o tempo entre comer e tomar banho!");
        int a, b = 1, tempo = 10;
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < b; i++) {
            System.out.println("Quanto tempo gasta no banho?");
            a = ler.nextInt();
            if (a <= 0) {
                System.out.println(nome + " resolve não tomar banho, você está fedendo a merda!");
            } else if (a <= 3) {
                System.out.println(nome + " deu aquela molhada no suvaco e na bunda, conseguiu diminuir o cheiro, porém"
                        + " ainda fede a sardinha vencida");
            } else if (a <= 6) {
                System.out.println(nome + " Tomou um banho rápido, porém saiu do banheiro todo ensaboado!");
            } else if (a <= 10) {
                System.out.println(nome + " Tomou um banho decente, que todo ser humano deve ter");
            } else {
                System.out.println(nome + " Tomou um banho acima do tempo esperado!");
            }
            tempo = tempo - a;
            if (tempo < 0) {
                System.out.println("Você gastou tempo demais tomando banho, e agora vai se atrasar para escolar e não vai se tornar um cara lega!");
                System.out.println("Você perdeu ;-;");
                System.out.println("Digite 1 para tentar denovo...");
                a = ler.nextInt();
                if (a == 1) {
                    b++;
                }
                System.out.println("FIM DE JOGO");
            } else {
                System.out.println("Quanto tempo gasta para comer?");
                a=ler.nextInt();
            }
        }

    }

}
