package mppoop10;

/**
 * Clase que crea a un instrumento de viento.
 * @author David Gomez, David Montoya
 */
public class InstrumentoViento extends Object implements  InstrumentoMusical{
    //Las clases pueden implementar vaias interfaces pero solo heredar de una.
    /**
     * Se afina el instrumento de viento.
     */
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento.");
    }
    /**
     * Se toca el instrumento de viento.
     */
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento.");
    }
    /**
     * Método sobreescrito que imprime el tipo de instrumento.
     * @return Tipo de instrumento como cadena.
     */
    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
}
