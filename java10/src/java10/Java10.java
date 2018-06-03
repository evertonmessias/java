
package java10;

import java.io.IOException;

public class Java10 {
    
    public static void main(String[] args) throws IOException {
        String file = "/home/everton/programacao/java/java10/src/java10/arquivo.txt";
        Arquivo arquivo = new Arquivo(file);
        
        arquivo.gravar("oi....");
        
        //System.out.println(arquivo.ler());
        
        
		
		
	}
    
}
