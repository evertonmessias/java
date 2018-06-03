
package java04;

public class Aluno {
    /*classe com o mesmo nome do arquivo!*/
    
    private String nome;
    private float nota1,nota2;
    
    public String matricula = "12345"; 
    public boolean casado = true;
    public char sexo = 'M';
    public int idade = 40;
    

    public float media() {   
        return (this.nota1 + this.nota2)/2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }    
         
}
