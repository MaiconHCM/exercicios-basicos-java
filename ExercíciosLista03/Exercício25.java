/*25. Supondo que a população de um país A seja da ordem de 90.000 habitantes 
com uma taxa anual de crescimento de 3% e que a população de um país B seja, 
aproximadamente, de 200.000 habitantes com uma taxa anual de crescimento de 1,5%
, fazer um programa que calcule e escreva o número de anos necessários para que 
a população do país A ultrapasse ou se iguale à população do país B, mantidas 
essas taxas de crescimento.*/
package ExercíciosLista03;

public class Exercício25 {
    public static void main(String[] args) {
        double a=90000,b=200000; int c=0;
        while(true){
            a=a*1.03;
            b=b*1.015;
            c++;
            System.out.println("no ano "+c+" pais A possui "+a+" habitantes e "
                    + "pais B possui "+b+" habitantes");
            if (a>b){
                break;
            }
        }System.out.println("Demorará "+c+" anos.");
    }
    
}
