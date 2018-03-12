
package java04;
import java.util.Scanner;

public class Java04 {

public static void main(String[]args){

Scanner ler= new Scanner(System.in);
Aluno aluno= new Aluno();

String casado = Boolean.toString(aluno.casado); 
int mat = Integer.parseInt(aluno.matricula);  //conversões de tipos

System.out.println("Digite seu nome:");
aluno.setNome(ler.nextLine());
System.out.println("Digite sua nota 1:");
aluno.setNota1(ler.nextFloat());
System.out.println("Digite sua nota 2:");
aluno.setNota2(ler.nextFloat());
//
System.out.printf("\nDados:"
        + "------------\n"
        + "Nome: %s\n"
        + "Matric: %d\n"
        + "Sexo: %c , Idade: %d\n"
        + "Casado: %s\n"
        + "Média: %.2f\n"
        + "------------\n"
        + "\n",aluno.getNome(),mat,aluno.sexo,aluno.idade,aluno.casado,aluno.media());
}}