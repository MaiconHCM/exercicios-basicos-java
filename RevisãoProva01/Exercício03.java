/*03 - Faça um programa que calcule a quantidade de tijolos iguais(qtd) 
necessários para construir uma determinada parede. São dados de entrada do 
programa: dimensões do tijolo(comprimento - ct e largura - lt) e dimensões da 
parede a ser construída(comprimento - cp e largura - lp). 
As dimensões do tijolo tem que ser em cm e convertidas para m, pois as 
dimensões da parede estão em metros.
 */
package RevisãoProva01;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        int tijolocmx,tijolocmy,paredemtx,paredemty;
        double tijolomtx,tijolomty,qtdx,qtdy,qtd;
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe o comprimento do tijolo(cm):");
        tijolocmx=ler.nextInt();
        System.out.println("Informe a largura do tijolo(cm):");
        tijolocmy=ler.nextInt();
        System.out.println("Informe o comprimento da parede(Metros):");
        paredemtx=ler.nextInt();
        System.out.println("Informe a largura da parede:");
        paredemty=ler.nextInt();
        tijolomtx=(double)tijolocmx/100;
        tijolomty=(double)tijolocmy/100;
        qtdx=paredemtx/tijolomtx;
        qtdy=paredemty/tijolomty;
        qtd=qtdx*qtdy;
        System.out.println("a quantidade de tijolos necessarios é de "+qtd);
        }
}
