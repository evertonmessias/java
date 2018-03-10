
package java04;
import java.util.Scanner;

public class Java04 {

String nome, matricula = "12345"; 
boolean casado = true;
char sexo = 'M';
int idade = 40;
float nota1,nota2;

float media(){return (nota1 + nota2)/2;}

public static void main(String[]args){

Scanner ler= new Scanner(System.in);
Java04 aluno= new Java04(); // main é necessário Orientação a Objetos

String casado = Boolean.toString(aluno.casado); 
int mat = Integer.parseInt(aluno.matricula);  //conversões de tipos

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
        + "\n",aluno.nome,mat,aluno.sexo,aluno.idade,aluno.casado,aluno.media());
}}