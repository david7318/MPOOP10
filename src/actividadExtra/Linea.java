package actividadExtra;
/**
 * Clase abstracta que crea una linea
 * @author David Gomez, David Montoya
 */
public abstract class Linea implements FiguraGeometrica{
    
    final int DIMENSION = 1;
    /**
     * Método abstracto de la interfaz FiguraGeometrica que dibuja una Linea
     */
    @Override
    public void dibujarse() {
     
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que mueve una Linea
     */
    @Override
    public void moverse() {
        
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que borra una Linea
     */
    @Override
    public void borrarse() {
        
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que crea una Linea
     */
    @Override
    public void crearse() {
        
    }
    /**
     * Método que devuelve la dimensión de una Linea como String
     * @return La dimensión de la línea
     */
    public String dimension(){
        return "La curva tiene dimension: " + DIMENSION;
    }
}
