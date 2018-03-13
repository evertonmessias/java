package java06;
public class Java06 {
    public static void main(String[] args) {        
        Lutador l0 = new Lutador("Magrão", "Brasil", 30, 1.8f, 80, 1, 5, 1, 2);
        Lutador l1 = new Lutador("Dede", "Alemanha", 25, 1.7f, 70, 1, 6, 0, 1);
        Luta luta = new Luta();
        luta.marcarLuta(l0, l1);
        luta.lutar();
        l0.status();l1.status();
        System.out.println("\n*********\n");        
        System.out.println(luta.getDesafiado().getNome());}}