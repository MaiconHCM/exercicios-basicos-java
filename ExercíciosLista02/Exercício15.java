/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercíciosLista02;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class Exercício15 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double alt,pesoi,peso;
        int sexo;
        System.out.println("Informe seu peso atual:");
        peso=ler.nextDouble();
        System.out.println("Informe a altura:");
        alt=ler.nextDouble();
        System.out.println("Digita 1 para homen e 2 para mulher:");
        sexo=ler.nextInt();
        if (sexo==1){
            pesoi=(72.7*alt)-58;
            if (peso<pesoi){
                System.out.println("Você está magro");}
            else if (peso>pesoi) {
                System.out.println("Você está fora de forma");
            }else {
                System.out.println("Está em forma!");
            }
            
        }
        else{
            pesoi=(62.1*alt)-44.7;
            if (pesoi<peso){
                System.out.println("Você está com anorlexia");
            }else if (pesoi>peso){
                System.out.println("Você está excesso de gostosura");
            }else {
                System.out.println("Você está pronta para balada");
            }        }            System.out.println("Seu peso é "+peso+" e o ideal é "+pesoi);

    }
}
