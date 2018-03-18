// JOGO DA FORCA

package java08;

import java.util.Scanner;

public class Java08 {
    
    String palavra = "prato";
    char letra;
    int x,acum,jogada=0,i=palavra.length();
    int chances = 6;
    int acompletar=i;
    boolean acerto, ok;
    char[] coringa = new char[i];
    char[] repetido = new char[26];
        
    public void busca(char letra){
        acum=0;
        acerto = false;
        ok = true;        
        for (x=0;x<i;x++){      
            if(coringa[x]==letra){ 
                ok = false;
                return;}}        
        for (x=0;x<26;x++){      
            if(repetido[x]==letra){ 
                ok = false;
                return;}}        
        for (x=0;x<i;x++){
            if(palavra.charAt(x)==letra){ 
                acum++;
                coringa[x] = letra;  
                acerto = true;}}
    }
    
    public void jogar(char letra){        
        System.out.println("\nJOGADA "+ (jogada+1) +" / LETRA ==> "+letra);
        busca(letra);
        repetido[jogada] = letra;
        if(ok == false){System.out.println("Letra Repetida..");}
        else if(acerto == true){System.out.println("**Acertou**");
        acompletar=acompletar-acum;}
        else if(acerto == false){System.out.println("_ERROU_");chances--;}        
        System.out.println("Chance "+chances+"/6");
        jogada++;
    }
     
    
    public static void main(String[] args) {
        int x;
        Scanner ler= new Scanner(System.in);        
        Java08 teste = new Java08();
        System.out.println("\n***JOGO DA FORCA***\n");
        System.out.println("Dica: Tem na cozinha com "+teste.i+" letras\n");
        System.out.println("Chance 6/6\n");
        for(x=0;x<teste.i;x++){teste.coringa[x]='#';}
        for(x=0;x<teste.i;x++){System.out.print(teste.coringa[x]);}
        while(teste.chances > 0 && teste.acompletar > 0 && teste.jogada < 26){          
            System.out.println("\n\nDigite uma letra:");
            char letra = ler.next().charAt(0);
            teste.jogar(letra);
            System.out.print("\n");
            for(x=0;x<teste.i;x++){
            System.out.print(teste.coringa[x]);
            }
        }
        if(teste.acompletar <= 0){
        System.out.println("\n\n*** VENCEU ***\n");}
        else{System.out.println("\n\n*fim do jogo!*\n");}        
    }    
}