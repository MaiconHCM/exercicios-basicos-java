/*10. A conversão de graus Fahrenheit para centígrados é obtida pela fórmula 
C=5/9(F-32). Escreva um algoritmo que calcule e escreva uma tabela de graus 
centígrados em função de graus Fahrenheit que variem de 50 a 70 de 1 em 1. */
package ExercíciosLista03;


public class Exercício10 {
    public static void main(String[] args) {
        double C;
        for (int F = 50; F <= 70; F++) {
        C=5/9+(F-32);
            System.out.println(F+" equivale a "+C);
        }
    }
    
}
