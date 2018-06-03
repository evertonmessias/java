package java07;

public class Java07 {

    public static void main(String[] args) {        

//Pessoas h = new Pessoas(); // abstract não instancia

Aluno a = new Aluno();
Professor p = new Professor();

a.setNome("Maria"); // Nome herdado	
p.setNome("Cláudio");
a.setIdade(25);
p.setIdade(55);

p.aula();a.aula();

System.out.println(a.toString());
System.out.println(p.toString());  

    }    
}
