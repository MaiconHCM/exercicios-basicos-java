/*Faça um algoritmo que leia dois vetores (A e B) de 10 posições de números. 
Crie também um terceiro vetor (C) de 10 posições de números. O algoritmo deve, 
então, subtrair o primeiro elemento de A do último de B, acumulando o valor em 
C, subtrair o segundo elemento de A do penúltimo de B, acumulando o valor em C, 
e assim por diante. Mostre o resultado do vetor C, mostre também a quantidade de
números positivos e negativos no vetor C e a porcentagem de números positivos e 
negativos no vetor C */
package RevisãoProva06;

public class Exercício05 {
    public static void main(String[] args) {
        int a[]=new int[10],b[]=new int[10],c[]=new int[10],d=0,e=0;
        for (int i = 0; i < c.length; i++) {
            a[i]= (int) (Math.random()*100);
            b[c.length-1-i]= (int) (Math.random()*100);
            c[i]=a[i]-b[c.length-1-i];
            System.out.printf("A[%d]=%d - B[%d]=%d = C[%d]=%d\n",i,a[i],c.length-1-i,b[c.length-1-i],i,c[i]);
            if (c[i]>=0){
                d++;
            }else{
                e++;
            }
        }System.out.println("Porcentagem de números positivos: "+(((double)c.length/100)*d)*100);
        System.out.println("Porcentagem de números negativos: "+(((double)c.length/100)*e)*100);
        
    }
}
