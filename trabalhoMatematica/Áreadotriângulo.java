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
public class Áreadotriângulo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

      System.out.println("Insira a largura do triângulo");
      double base = scanner.nextDouble();

      System.out.println("Insira a altura do triâgulo");
      double height = scanner.nextDouble();

      double area = (base* height)/2;
      System.out.println("Area do Triangulo é: " + area);      
   }
}