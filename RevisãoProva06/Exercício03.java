/*Em um cinema, certo dia, 30 espectadores responderam a um questionário, que 
perguntava a sua idade e a opinião em relação ao filme, seguindo os seguintes 
critérios:
Opinião
Significado
1 Ótimo
2 Bom
3 Regular
4 Ruim
5 Péssimo
A entrada de dados sobre a opinião e sobre a idade pode ser gerada aleatoriamente.
Construa um programa que, lendo esses dados, calcule e apresente:
Quantidade de pessoas que respondeu a pesquisa satisfatoriamente (opções 1, 2 e 3).
Média de idade das pessoas que responderam a pesquisa.
Porcentagem de cada uma das respostas.
 */
package RevisãoProva06;

/**
 *
 * @author Maicon
 */
public class Exercício03 {
    public static void main(String[] args) {
      int a[]=new int[30],b[]=new int[30],c=0,d=0;double n1=0,n2=0,n3=0,n4=0,n5=0;
        for (int i = 0; i < b.length; i++) {
            a[i]= (int) (Math.random()*34)+6;
            b[i]= (int) (Math.random()*5)+1;
            d=d+a[i];
            if (b[i]==1) {
                c++;
                n1++;
            }else if (b[i]==2) {
                c++;
                n2++;
            }
            else if (b[i]==3) {
                c++;
                n3++;
            }
            else if (b[i]==4) {
                n4++;
            
            }
            else if (b[i]==5) {
                n5++;
            }
            
            
        }System.out.println("Quantindade de pessoas que responderam satisfatoriamente "+c);
        System.out.println("Média de idade "+(d/a.length));
        n1=((double)100/b.length)*n1;
        n2=(((double)100/b.length)*n2);
        n3=(((double)100/b.length)*n3);
        n4=(((double)100/b.length)*n4);
        n5=(((double)100/b.length)*n5);
        System.out.printf("Percentual\nNota 1:%.2f\nNota 2:%.2f\nNota 3:%.2f\nNota 4:%.2f\nNota 5:%.2f\n",n1,n2,n3,n4,n5);
    }}