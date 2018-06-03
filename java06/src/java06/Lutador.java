package java06;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private float altura, peso;
    private int idade, categoria, vitorias, derrotas, empates;
    
    // Metodos    
    public void apresentar(){
        System.out.println("-----------APRESENTAÇÃO-----------");
        System.out.println("Lutador : " + this.getNome() + ", Nacionalidade: " + this.getNacionalidade());
        System.out.println("Categoria: Peso " + this.getCategoria());
        System.out.println("Idade: " + this.getIdade() + " anos ; Peso: " + this.getPeso() + " Kg");
        System.out.println("Vitorias: " + this.getVitorias() + ", Derrotas: " + this.getDerrotas() + ", Empates: " + this.getEmpates());
        System.out.println("---------------//------------------");
        }
    
    public void status(){
        System.out.println("------------STATUS-----------------");
        System.out.println("Nome: " + this.getNome() + ", categoria: " + this.getCategoria()); 
        System.out.println("Vitorias: " + this.getVitorias() +", Derrotas: " + this.getDerrotas() + ", Empates: " + this.getEmpates());
        System.out.println("---------------//------------------");
        }
    
    public void ganhaLuta(){
        this.setVitorias(this.getVitorias() + 1);
        }

    public void perdeLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        }

    public void empataLuta(){
        this.setEmpates(this.getEmpates() + 1);
        }

    // Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int categoria, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

// ********************** Metodos getters e setters  ***************************   
    
    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public  int getCategoria() {
        return this.categoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
     }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    } 
    

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
 
}
