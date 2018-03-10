/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6;

/**
 *
 * @author everton
 */
public class Java6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;char cod;
        for (i=0;i<255;i++){
            cod = (char)i;
            System.out.printf("Cod %d ==> %s\n",i,cod);
        }
    }
    
}
