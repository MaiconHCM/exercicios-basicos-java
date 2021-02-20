/*4. Fulano aplicou R$ 1.000,00 no banco White Duck, obtendo com esta aplicação 
um rendimento de 1.5% em meses pares e 1% nos meses ímpares. Escreva um programa
que calcule e escreva qual será o rendimento obtido por esta aplicação ao final 
de 18 meses.
 */
package RevisãoProva05;

public class Exercício04 {
    public static void main(String[] args) {
        double a=1000,b;
        for (int i = 1; i <= 18; i++) {
            if(i%2==0){
              a=a*1.015;
            }else{
                a=a*1.01;
            }
            System.out.println(i+"° mês - Valor atual: "+a+", Rendimento de "
                    + ""+(a-1000));
        }System.out.println("Valor final será: "+a+"\nRendimento de "+(a-1000));
    }
}
