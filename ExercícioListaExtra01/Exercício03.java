/*Alice e Beto são amigos desde crianças e sempre que se encontram relembram os 
tempos de infância tirando par-ou-ímpar para decidir quem escolhe o filme a ser
assistido, ou qual o restaurante em que vão almoçar, etc. Escreva um programa 
para determinar que ganhou a série de par-ou-ímpar.

Entrada
A primeira entrada deve ser um valor que identifica a quantidade de jogos 
realizados, identificada pela variável ‘n’. A seguir deve-se ler os ‘n’ 
resultados dos jogos. Se Ri = 0 significa que Alice ganhou o i-ésimo jogo e se 
Ri = 1 significa que Beto ganhou o i-ésimo jogo.

Saída
O programa deve produzir uma linha na saída, no formato ‘Alice ganhou X e Beto 
ganhou Y jogos’.
*/
package ExercícioListaExtra01;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        System.out.println("Informe número de jogos realizados:");
        int a,b=0,c=0;
        a=ler.nextInt();
        for (int i = 0; i <= a; i++) {
            a=(int)(Math.random()*2);
            System.out.println(i+"° resultado:"+a);
            if (a==0){
                b++;
            }else{
                c++;
            }
        }System.out.println("Alice ganhou:"+a+" enquanto beto ganhou:"+b);
    }
}
