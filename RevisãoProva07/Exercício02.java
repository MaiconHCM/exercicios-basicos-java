/*2 - Faça um algoritmo para ler um vetor de 25 elementos do tipo numérico e 
verificar se existem elementos iguais a 25. Se existirem, o algoritmo deve 
escrever quantas vezes aparecem e quais as posições que estão armazenados.
 */
package RevisãoProva07;

/**
 *
 * @author Maicon
 */
public class Exercício02 {
    public static void main(String[] args) {
     int a[]=new int [25],b=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)  (Math.random()*15)+15;
            if(25==a[i]){
                System.out.println("Aparece na posição A["+i+"]");
                b++;
                
        }
            
    }
    System.out.println("25 aparece "+b+" Vezes");
            
            
        
}}
