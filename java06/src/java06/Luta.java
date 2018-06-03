
package java06;

import java.util.Random;

public class Luta {
     
     // Atributos
           
     private Lutador desafiado;
     private Lutador desafiante;
     private int rounds;
     private boolean aprovada;
     
     // Metodos Publicos
     
     public void marcarLuta(Lutador l1,Lutador l2){
         if(l1.getCategoria() == l2.getCategoria() && l1 != l2 ){
             this.setAprovada(true);
             this.setDesafiado(l1);
             this.setDesafiante(l2);            
         }else {
             this.setAprovada(false);
             this.setDesafiado(null);
             this.setDesafiante(null);
         }
     }
     
     public void lutar(){
         if (this.isAprovada()){
             this.desafiado.apresentar();
             this.desafiante.apresentar();
             Random gerador = new Random();
             int vencedor = gerador.nextInt(3);
             switch (vencedor){
                 case 0: // empate
                     System.out.println("Empatou a luta !");
                     this.desafiado.empataLuta();
                     this.desafiante.empataLuta();
                     break;
                 case 1: // Desafiado vence
                     System.out.println(this.desafiado.getNome()+" venceu a luta");
                     this.desafiado.ganhaLuta();
                     this.desafiante.perdeLuta();                         
                     break;
                 case 2: // Desafiante vence
                     System.out.println(this.desafiante.getNome()+" venceu a luta");
                     this.desafiante.ganhaLuta();
                     this.desafiado.perdeLuta();
                     break;                 
             }
         }
         else{
             System.out.println("Luta não pode acontecer !");
         }}

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    } 
}