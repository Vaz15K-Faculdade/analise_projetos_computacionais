
package conceito;

/**
 *
 * @author Evandro
 */
public class Dado {
    
    private int face;
    
    public Dado(){
        this.lancar();
    }
    
    public int lancar(){
        this.face = 1 + ( int ) ( Math.random() * 6 );
        return this.face;
    }

    public int ultimoLance(){
        return this.face;
    }
}
