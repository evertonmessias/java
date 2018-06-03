package java07;

public class Aluno extends Pessoas {    
    private int matr;
    
    @Override
    public void aula() {System.out.println("*** "+this.getNome()+" Reprovou !!! ***\n");}

    public int getMatr() {return matr;}
    public void setMatr(int matr) {this.matr = matr;}
    
}
