
package Aulas_Período01;

public class Aula0506vetoresparte2 {
    public static void main(String[] args) {
        int a[]= new int [10],b[]=new int [10],c[]=new int [20];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int) (Math.random()*50);
            b[i]=(int) (Math.random()*50);
            
        }for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
            c[i+a.length]=b[i];
            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%2d] = %2d C[%2d] + %2d B[%2d] = %2d     c[%2d] = %2d\n",i,a[i],i,c[i],i,b[i],i+a.length,c
                  [i+a.length] );
            
        }
    }
}
