/**Essa aula ensina a usar variaveis no caso, a int que significa inteiro e ela
 * tem por objetivo indicar numeros inteiros como 1 , 2 , 3 , 10 , 50 etc.
 * números que não possuem virgula*/
package Extras;
public class Aula01_Basico {
    //Aqui vc escreve oq tem que escrever ou seja, CÓDIGOS - SR.WILSON
        public static void main(String[] args) {
        int x, y, soma, menos, divisao;
        x = 50;
        y = 10;
        soma = x + y;
        menos = x - y;
        divisao= x / y;
        System.out.println("Os valores " + x + " e " + y + " em caso de soma é "
                + "ingual a " + soma + " em caso de subtração é " + menos +
                " e em caso de divisão é " + divisao);
            System.out.println("Quando " + soma + " dividido por " + divisao +
                    " o resultado é " + (soma/divisao));
        }
    
}
