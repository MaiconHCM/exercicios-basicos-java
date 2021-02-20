/*Construa um programa com um vetor onde são informados os salários dos 10 
funcionários de uma empresa. Calcule o novo salário para cada um dos 
funcionários da empresa e armazene em outro vetor. Considere que o funcionário 
deverá receber um reajuste de 15% caso seu salário seja menor que 500. Se o 
salário for maior ou igual a 500, o reajuste deve ser de 10%.
Apresentar no final o salário antigo, o novo salário e a diferença entre os 
salários. Além disso, ao final, o programa deve apresentar quanto será gasto a 
mais pela empresa com esses aumentos.
 */
package RevisãoProva06;

import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
    Scanner ler=new Scanner (System.in);
        double a[]=new double [10], b[]=new double [10],c[]=new double [10],d=0;
        for (int i = 0; i < b.length; i++) {
            System.out.println("Insira o salário do funcionario");
            a[i]=ler.nextDouble();
            if(a[i]<500){
            b[i]=a[i]*1.15;
            }else{
            b[i]=a[i]*1.10;
            }
            c[i]=b[i]-a[i];
            d=d+c[i];
            
        }
        System.out.println("FUNCIONARIO  SALÁRIO ANT.  SALÁRIO NOVO  DIFERENÇA");
        for (int i = 0; i < c.length; i++) {
          
        System.out.printf("%d             %.2f          %.2f         %.2f\n",i,a[i],b[i],c[i]);
        }
        System.out.printf("Total em aumentos: %.2f\n",d);
        
    }
}
