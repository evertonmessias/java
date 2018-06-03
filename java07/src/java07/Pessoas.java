package java07;

public abstract class Pessoas{
    protected String nome;
    private  int idade;
    
    abstract void aula();// polimorfismo de sobreposição 
    
     @Override
    public String toString() {return "Pessoas{" + "nome=" + nome + ", idade=" + idade + "}\n";}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
}
