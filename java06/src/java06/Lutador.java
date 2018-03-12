
package java06;

public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private float idade, altura, peso;
    private int categoria, vitorias, derrotas, empates;
    
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
        System.out.println("Nome: " + this.getNome() . ", categoria: " + this.getCategoria()); 
        System.out.println("Vitorias: ".this.getVitorias().", Derrotas: ".this.getDerrotas().", Empates: ".this.getEmpates());
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
    public void __construct(no, na, id, al, pe, vi, de, em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

// ********************** Metodos getters e setters  ***************************   
    
    public getNome() {
        return this.nome;
    }

    public getNacionalidade() {
        return this.nacionalidade;
    }

    public getIdade() {
        return this.idade;
    }

    public getAltura() {
        return this.altura;
    }

    public getPeso() {
        return this.peso;
    }

    public getCategoria() {
        return this.categoria;
    }

    public getVitorias() {
        return this.vitorias;
    }

    public getDerrotas() {
        return this.derrotas;
    }

    public getEmpates() {
        return this.empates;
    }

    public void setNome(nome) {
        this.nome = nome;
    }

    public void setNacionalidade(nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(idade) {
        this.idade = idade;
    }

    public void setAltura(altura) {
        this.altura = altura;
    }

    public void setPeso(peso) {
        this.peso = peso;
        this.setCategoria();
    }
 
    public void setCategoria() {
        if (this.peso < 52.2){this.categoria = "Invalido";}
        elseif (this.peso <= 70.3){this.categoria = "Leve";}
        elseif (this.peso <= 83.9){this.categoria = "Medio";}
        elseif (this.peso <= 120.2){this.categoria = "Pesado";}
        else {this.categoria = "Invalido";}
    }

    public void setVitorias(vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(empates) {
        this.empates = empates;
    }
 
}
    
    
    
}
