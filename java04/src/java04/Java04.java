
package java04;
import java.util.Scanner;


public class Java04 {


private String nome;
private double nota1,nota2,media;

public double calcular(){
    return (this.nota1 + this.nota2)/2;       
}



public static void main(String[]args){
Scanner ler= new Scanner(System.in);
Java04 aluno= new Java04();
System.out.println("Digite seu nome:");
aluno.nome=ler.nextLine();
System.out.println("Digite sua nota 1:");
aluno.nota1=ler.nextDouble();
System.out.println("Digite sua nota 2:");
aluno.nota2=ler.nextDouble();
aluno.media = aluno.calcular();
System.out.printf("\nAluno: %s\nMédia: %.2f\n\n",aluno.nome,aluno.media);
}
}
    
