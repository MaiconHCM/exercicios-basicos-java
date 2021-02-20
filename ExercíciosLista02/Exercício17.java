/*17. Ler a idade de uma pessoa e informar a sua classe eleitoral, conforme:
Não-eleitor (abaixo de 16 anos)
Eleitor obrigatório (entre 18 e 65 anos)
Eleitor facultativo (entre 16 e 18 ou maior de 65 anos). 
 */
package ExercíciosLista02;

import java.util.Scanner;

public class Exercício17 {
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        int a;
        System.out.println("Informe sua idade:");
        a=ler.nextInt();
        if (a<16) {
            System.out.println("Não-eleitor");
        }else if (a<=17){
            System.out.println("Eleitor facultativo");
        }else{
            System.out.println("Eleitor obrigatorio");
        }
    }
    
}
