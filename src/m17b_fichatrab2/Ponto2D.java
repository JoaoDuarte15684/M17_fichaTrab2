package m17b_fichatrab2;

/**
 * Classe Ponto2D, para instanciar pontos
 * @version 1.1, 07.fev.2017
 * @author a15684
 */

public class Ponto2D {
    /** Pontos x e y*/
    private int x;
    private int y;
    
    // Faltam construtor, getters e setters.
    
    /**
     * Construtores com dois parâmetros, que inicializa os atributos
     * com valores predefinidos.
     */
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /**
     * 
     * @return valor de x.
     */
    public int getX() {
        return x;
    }
    /**
     * 
     * @return valor de y.
     */
    public int getY() {
        return y;
    }
    /**
     * 
     * @param x. 
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * 
     * @param y.
     */
    public void setY(int y) {
        this.y = y;
    } 
    /**
     * 
     * @param a
     * @return 
     */
    public double distancia(Ponto2D a){
        // Falta fazer este método.
        
        return 0.0;
    }
    
}
