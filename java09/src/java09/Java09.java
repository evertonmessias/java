/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java09;

/**
 *
 * @author everton
 */
public class Java09 {
    
    public static void main(String[] args) {               
        
        int i;
        char caracter;
        
        for (i=0;i<1024;i++){
            caracter = (char)i;
            System.out.println(i+" ==> "+caracter);        
        }
    }
    
}
