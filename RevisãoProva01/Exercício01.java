/*01 – Faça um programa para calcular a quantidade de dinheiro gasta por um
fumante. Dados: o número de anos (considerar 365 dias por ano) que ele fuma, o 
número de cigarros fumados por dia e o preço de uma carteira (considerar 20 
cigarros por carteira). Após obter o valor gasto solicite ao usuário o valor de
um carro novo e informe o percentual do valor do carro já gasto em cigarros.
Fórmulas:
Total gasto = preço da carteira de cigarro * (365 * número de cigarros fumados
por dia * número de anos) / 20).
Percentual do carro = total gasto / preço do carro * 100 */
package RevisãoProva01;
import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int anos,cig; double din,totdin,car,pcar;
        System.out.println("Informe quantos anos você fuma:");
        anos=ler.nextInt();
        System.out.println("Quantos cigaros você fuma por dia?");
        cig=ler.nextInt();
        System.out.println("Qual preço atual de uma carteira?");
        din=ler.nextDouble();
        totdin=din*(365*cig*anos)/20;
        System.out.println("Informe o valor de um carro novo que você deseja:");
        car=ler.nextDouble();
        pcar=totdin/car*100;
        System.out.println("você gastou no total "+totdin+"R$, isto equivale"
                + " a "+pcar+"% de um carro de "+car+"R$");
    }
}
