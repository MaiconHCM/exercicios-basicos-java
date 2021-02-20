//como fazer taxa de juros e tudo que é possivel.
package Aulas_Período01;
import java.util.Scanner;
public class Aula0603Sequencia {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double vlrcarro,vlrmeu,taxaj,taxad,juro,desc,totalj,totald,pcttenho;
        
        System.out.println("Informe o valor do carro:");
        vlrcarro=ler.nextDouble();
        System.out.println("Informe o quantidade que você possui:");
        vlrmeu=ler.nextDouble();
        System.out.println("Informe o valor da taxa de juros");
        taxaj=ler.nextDouble();
        System.out.println("Informe o valor de desconto");
        taxad=ler.nextDouble();
        
        juro=vlrcarro*taxaj/100;
        totalj=vlrcarro+juro;
        desc=vlrcarro*taxad/100;
        totald=vlrmeu/vlrcarro*100;
        pcttenho=vlrmeu/vlrcarro*100;
        
        System.out.println("Juros cobrados: "+juro);
        System.out.println("Descontos: "+desc);
        System.out.println("Total com juro: "+totalj);
        System.out.println("Total com desconto: "+totald);
        System.out.println("% que possuo: "+pcttenho);
    }
}
