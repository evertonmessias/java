package beans;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Eq2grau {
    
    public float valorA, valorB, valorC, d, x1, x2;    
    
    public String escrever(){ 
        char q = (char)178;
        String eq, a, b, c;
        a = String.format("%.1f",this.valorA);
        b = String.format("%.1f",this.valorB);
        c = String.format("%.1f",this.valorC);
        if(this.valorB < 0 && this.valorC < 0){
        eq = a+"x"+q+" "+b+"x "+c+" = 0";}
        else if(this.valorB >= 0 && this.valorC < 0){
        eq = a+"x"+q+" +"+b+"x "+c+" = 0";}
        else if(this.valorB < 0 && this.valorC >= 0){
        eq = a+"x"+q+" "+b+"x +"+c+" = 0";}
        else{
        eq = a+"x"+q+" +"+b+"x +"+c+" = 0";}
        return eq; }
      
    public float[] calcular(){
        float vc[] = new float[4];
        if(this.valorA == 0) {vc[0] = 0;vc[1] = 0;vc[2] = 0;vc[3] = 0;}// vc[3] == 0 => "A Não pode ser Zero!"
        else {d=(float) ((pow(this.valorB, 2))-(4*this.valorA*this.valorC)); // cálculo do delta               
        if (d < 0){vc[0] = d;vc[1] = 0;vc[2] = 0;vc[3] = 1;}// vc[3] == 1 => "Não Existe Raizes Reais!"
        else{x1=(float) (((-1*this.valorB)+(sqrt(d)))/(2*this.valorA)); // cálculo de Basckara
             x2=(float) (((-1*this.valorB)-(sqrt(d)))/(2*this.valorA));
             vc[0] = d;vc[1] = x1;vc[2] = x2;vc[3] = 2;}} // vc[3] == 2 => ok
        return vc;}
    
    public String resposta(int vc3){
        int op = vc3;
        switch (op) {
            case 0:
                return "Valor 'A' n�o pode ser Zero!";
            case 1:
                return "N�o Existe Raizes Reais!";
            default:
                return this.escrever();
        }}   
    
}

