package mppoop10;

/**
 * Interfaz de un instrumento musical.
 * @author David Gomez, David Montoya
 */
public interface InstrumentoMusical {
    //Por defecto, todos los métodos dentro de la interfaz son públicos y abstractos.
    /**
     * Método que indica cuando se afina el instrumento.
     */
    void afinar();
    /**
     * Método que indica cuando se toca el instrumento.
     */
    void tocar();
    /**
     * Método que indica el tipo de instrumento que se tiene.
     * @return Tipo de instrumento como cadena.
     */
    String tipoInstrumento();
}
