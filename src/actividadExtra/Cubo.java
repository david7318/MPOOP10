package actividadExtra;

/**
 *  Clase que crea a un cubo.
 * @author David Gomez, David Montoya
 */
public class Cubo extends Volumen{
    private double longitudArista,longitudDiagonalCubo;
    private String color;
    /**
     * Constructor vacío.
     */
    public Cubo() {
    }
    /**
     * Constructor con parámetros.
     * @param longitudArista Longitud de la arista del cubo.
     * @param longitudDiagonalCubo Longitud de la diagonal del cubo.
     * @param color Color exterior del cubo.
     */
    public Cubo(double longitudArista, double longitudDiagonalCubo, String color) {
        this.longitudArista = longitudArista;
        this.longitudDiagonalCubo = longitudDiagonalCubo;
        this.color = color;
    }

    public double getLongitudArista() {
        return longitudArista;
    }

    public void setLongitudArista(double longitudArista) {
        this.longitudArista = longitudArista;
    }

    public double getLongitudDiagonalCubo() {
        return longitudDiagonalCubo;
    }

    public void setLongitudDiagonalCubo(double longitudDiagonalCubo) {
        this.longitudDiagonalCubo = longitudDiagonalCubo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que calcula el volumen del cubo.
     * @return Volumen del cubo.
     */
    public double calcularVolumen(){
        return longitudArista*longitudArista*longitudArista;
    }
    /**
     * Método que calcula el área de una de las caras del cubo.
     * @return Área de una de las caras del cubo.
     */
    public double calcularAreaCara(){
        return longitudArista*longitudArista;
    }
    /**
     * Método que indica cuando el cubo gira sobre alguno de sus ejes.
     */
    public void rotarCubo(){
        System.out.println("El cubo gira sobre uno de sus ejes.");
    }
    /**
    * Método que calcula el área total del cubo.
    * @return El área total del cubo.
    */
    public double areaTotal(){
        return longitudArista*longitudArista*6;
    }
}
