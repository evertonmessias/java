package java07;

public class Professor extends Pessoas {
    private float sal;

    @Override
    public void aula() {System.out.println("*** "+this.getNome()+" corrigiu as provas. ***\n");}

    public float getSal() {return sal;}
    public void setSal(float sal) {this.sal = sal;}     
    
}
