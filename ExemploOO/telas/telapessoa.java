
package telas;
import modelo.pessoa;
public class telapessoa {
    public static void main(String[] args) {
        pessoa a = new pessoa ();
        pessoa b = new pessoa ("Géri");
        pessoa c = new pessoa ("Marli", 45,60,'F');
        System.out.println("Pessoa a:"+a.toString());
        System.out.println("Pessoa b:"+b.toString());
        System.out.println("Pessoa c:"+c.toString());
    }
}
