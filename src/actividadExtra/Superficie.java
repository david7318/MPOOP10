package actividadExtra;
/**
 * Clase abstracta que crea una superficie
 * @author David Gomez, David Montoya
 */
public abstract class Superficie implements FiguraGeometrica{

    final int DIMENSION = 2;    
    /**
     * Método abstracto de la interfaz FiguraGeometrica que dibuja una Superficie
     */
    @Override
    public void dibujarse() {
      
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que mueve una Superficie
     */
    @Override
    public void moverse() {
      
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que borra una Superficie
     */
    @Override
    public void borrarse() {
       
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que crea una Superficie
     */
    @Override
    public void crearse() {
        
    }
    /**
     * Método que devuelve la dimensión de una Superficie como String
     * @return La dimensión de la Superficie
     */
    public String dimension(){
        return "La superficie tiene dimension: " + DIMENSION;
    }
}
