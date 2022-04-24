package mppoop10;

/**
 * Clase que crea una flauta.
 * @author David Gomez, David Montoya
 */
public class Flauta extends InstrumentoViento{
    /**
     * Constructor vacío.
     */
    public Flauta(){
    }
    
    /**
     * Método sobreescrito que indica el tipo de instrumento que se tiene.
     * @return Tipo de instrumento como cadena.
     */
    @Override
    public String tipoInstrumento() {
        return "Flauta";
    }
}
