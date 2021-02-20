/*Desenvolver um programa que obtenha através do teclado os valores referentes 
aos cheques emitidos por um grupo de 3 correntistas. Armazenar estes valores no 
vetor “cheques”.  Crie um segundo vetor com os valores referentes aos saldos dos 
clientes. Armazenar estes valores no vetor “saldos”.

A seguir deve-se processar os valores calculando a soma dos cheques e dos saldos
e informando qual o cliente emitiu o maior cheque, supor que não haverá empates.
Também deve ser apresentado o saldo final de cada correntista.
 */
package RevisãoProva06;

/**
 *
 * @author Maicon
 */
public class Exercício04 {
    public static void main(String[] args) {
     double a[]=new double[3], b[]=new double [3],c=0,d=0,e=0;
        System.out.println("Saldo ant  Vlr cheque  Saldo atual");   
     for (int i = 0; i < b.length; i++) {
            a[i]=  (Math.random()*300);
            d=d+a[i];
            b[i]= (Math.random()*200);
            e=e+b[i];
            System.out.printf("%.2f  %.2f");
            if(a[i]>c){
                c=a[i];
            }
            System.out.printf("  %.2f",(a[i]-b[i]));
        }
        System.out.println("Soma dos cheques do vetor: "+d);
        System.out.println("Soma dos saldos do vetor:"+e);
     
    }
   
}
