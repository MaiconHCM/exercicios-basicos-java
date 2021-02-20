package game;

import java.util.Scanner;

public class JogoRaizQuadrada {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a,b,c=1,pontos=0;
        while(true){
          a=(int) (Math.random()*3)+c;
        
        b=a*a;
        System.out.println("Qual é raiz quadrada de "+b+" ?");
        b=ler.nextInt();
        if(a==b){
            System.out.println("Resposta correta!");
            c=c+3;
            pontos=pontos+b+50;
        }else {
            System.out.println("Respota incorreta! A resposta correta era "+a);
            System.out.println("Pontuação total: "+pontos);
            break;
        }  
        }
        
    }
}
