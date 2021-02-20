/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_Período01;

import java.util.Scanner;

/**
 *
 * @author Maicon
 */
public class AulaString {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        String nome;
        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();
        System.out.println("Nome em maiúsculas");
        System.out.println(nome.toUpperCase());
        System.out.println("Nome em minúsculas");
        System.out.println(nome.toLowerCase());
        System.out.println("Navegando pelo nome");
        for (int i = 0; i <nome.length(); i++) {
            System.out.println(nome.charAt(i));
            
        }System.out.println("Navegado pelo nome ao contrário");
        for (int i = nome.length()-1; i >= 0; i--) {
            System.out.println(nome.charAt(i));
            
        }
        System.out.println("Valores ASCII das letras");
        for (int i = 0; i < nome.length(); i++) {
            System.out.println("Letra: "+nome.charAt(i)+" decimal: "+(int)nome.charAt(i));
            
        }System.out.println("Criptografia do nome");
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(""+(char)((int)nome.charAt(i)+1));
            
        }
    }
}
