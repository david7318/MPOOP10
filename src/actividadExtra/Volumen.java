package actividadExtra;

/**
 * Clase abstracta que crea una figura geómetrica volumétrica.
 * @author David Gomez, David Montoya
 */
public abstract class Volumen implements FiguraGeometrica{
    final int DIMENSION=3;
    
    /**
     * Método abstracto de la interfaz FiguraGeometrica que dibuja un volumen.
     */
    @Override
    public void dibujarse() {
      
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que mueve un volumen.
     */
    @Override
    public void moverse() {
      
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que borra un volumen.
     */
    @Override
    public void borrarse() {
       
    }
    /**
     * Método abstracto de la interfaz FiguraGeometrica que crea un volumen.
     */
    @Override
    public void crearse() {
        
    }
    /**
     * Método que devuelve la dimensión de un volumen. como String.
     * @return La dimensión del volumen.
     */
    public String dimension(){
        return "El volumen tiene dimension: " + DIMENSION;
    }
}
