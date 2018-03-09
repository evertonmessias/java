
package java04;
import java.util.Scanner;

public class Java04 {

private String nome;
private float nota1,nota2;

public float media(){return (this.nota1 + this.nota2)/2;}

public static void main(String[]args){
String matricula = "12345"; 
boolean casado = true;
char sexo = 'M';
int idade = 30;

String casadoo = Boolean.toString(casado);
int mat = Integer.parseInt(matricula);
Scanner ler= new Scanner(System.in);
Java04 aluno= new Java04();
System.out.println("Digite seu nome:");
aluno.nome=ler.nextLine();
System.out.println("Digite sua nota 1:");
aluno.nota1=ler.nextFloat();
System.out.println("Digite sua nota 2:");
aluno.nota2=ler.nextFloat();
//
System.out.printf("\nDados:"
        + "------------\n"
        + "Nome: %s\n"
        + "Matric: %d\n"
        + "Sexo: %c , Idade: %d\n"
        + "Casado: %s\n"
        + "Média: %.2f\n"
        + "------------\n"
        + "\n",aluno.nome,mat,sexo,idade,casado,aluno.media());
}}