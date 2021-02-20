
package Aulas_Período01;

public class Aula0505Rep {
    public static void main(String[] args) {
    double a=0,b=2,c=500;
        for (int i = 1; i <= 10; i++) {
            if(b==2){
                a=a+b+(b/c);
                b=5;
            }else{
                a=a-(b/c);
                b=2;
            }c=c-50;
            
        }System.out.println("a:"+a);
    }
}
