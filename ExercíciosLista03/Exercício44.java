/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercíciosLista03;

/**
 *
 * @author Maicon
 */
public class Exercício44 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j>i) {
                    System.out.print("");
                }else {
                    System.out.print(""+j);
                }
            }System.out.println("");
        }
    }
}
