package m17b_fichatrab2;
/**
 * Main para criar e testar funcionamento de cordenadas da classe Ponto2D
 * @author a15684
 * @version 1.1 08.fev.2017
 */
public class Main {

    public static void main(String[] args) {
        // Ficha de Trabalho #2
        
        Ponto2D p1 = new Ponto2D(5,7);
        Ponto2D p2 = new Ponto2D(2,8);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p2.distancia(p1));
    }
    
}
