/*Em uma eleição para diretor existem dois candidatos. Os votos são informados 
através de códigos. Os dados utilizados para a contagem dos votos obedecem à 
seguinte codificação: 
- 11, 22 = voto para os respectivos candidatos; 
- Demais números = votos nulos e em branco;
Elabore um programa que leia o código do candidato e some um voto a cada 
confirmação (pressionamento de enter), o fim do processo se dará quando for 
informado o código 0. Calcule e escreva após cada voto:
- Total de votos para cada candidato;
- Total de votos brancos ou nulos;
- Percentual de votos brancos ou nulos;
- Candidato vencedor da eleição.
 */
package RevisãoProva05;

import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int b=0,c=0,d=0; double a;
        while(true){
            System.out.println("Informe o seu voto:(0 para sair)");
            a=ler.nextInt();
            if (a==11) {
                b++;
            }else if(a==22){
                c++;
            }else if (a==0){
                break;
            }else {
                d++;
            }
        }System.out.println("Votos (11):"+b+"\nVotos (22):"+c+"\nVotos nulos/"
                + "brancos:"+d);
        a=((double)100/(b+c+d))*d;
        System.out.println("Porcetagem de pontos nulos/brancos:"+a);
        if (b>c) {System.out.println("Candidato 11 ganhou");
            
        }else if (b<c){
            System.out.println("Candidato 22 ganhou");
        }else{
            System.out.println("Empate");
        }
    }
}
