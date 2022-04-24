package actividadExtra;

/**
 *  Clase que crea a un cilindro.
 * @author David Gomez, David Montoya
 */
public class Cilindro extends Volumen{
    private double radio, altura;
    private String color;
    
    /**
     * Constructor vacío.
     */
    public Cilindro() {
    }
    /**
     * Constructor con parámetros.
     * @param radio Radio de una de las caras del cilindro.
     * @param altura Altura del cilindro.
     * @param color Color del cilindro.
     */
    public Cilindro(double radio, double altura, String color) {
        this.radio = radio;
        this.altura = altura;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que calcula el área lateral del cilindro.
     * @return Área lateral del cilindro.
     */
    public double calcularAreaLateral(){
        return 6.2832*radio*altura;
    }
    /**
     * Método que calcula el área de uno del los círculos del cilindro.
     * @return Área de uno de los círculos del cilindro.
     */
    public double calcularAreaBase(){
        return 3.1416*radio*radio;
    }
    /**
     * Método que calcula el área total del cilindro.
     * @return Área total del cilindro.
     */
    public double calcularAreaTotal(){
        return 6.2832*radio*altura+2*3.1416*radio*radio;
    }
    /**
     * Método que calcula el área volumen del cilindro.
     * @return Voluemn del cilindro.
     */
    public double calcularVolumen(){
        return 3.1416*radio*radio*altura;
    }
}
