
package modelo;

public class pessoa {
    //definição dos atributos
    private String nome;
    private int idade;
    private double peso;
    private char sexo;
    
    public pessoa(){
        
    }

    public pessoa(String nome, int idade, double peso, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }

    public pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", sexo=" + sexo + '}';
    }
    
    //definição e recuperação

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
