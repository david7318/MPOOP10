package actividadExtra;
/**
 * Clase que crea un Rectangulo
 * @author David Gomez, David Montoya
 */
public class Rectangulo extends Superficie{
    float base, altura;
    String color;
    /**
     * Constructor vacío
     */
    public Rectangulo() {
    }
    /**
     * Constructor que recibe parámetros
     * @param base Base del Rectangulo
     * @param altura Altura del Rectangulo
     * @param color Color del rectángulo.
     */
    public Rectangulo(float base, float altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Método que calcula el perímetro del Rectangulo
     */
    public void perimetro(){
        System.out.println("El perimetro del rectángulo es = " + (2*base + 2*altura));
    }
    /**
     * Método que calcula el area de un Rectangulo
     */
    public void area(){
        System.out.println("El área del rectángulo es = " + base*altura);
    }
    /**
     * Método que calcula la longitud de la diagonal de un Rectangulo
     */
    public void longDiagonal(){
        System.out.println("La longitud de la diagonal del rectángulo es = " 
        + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
}
