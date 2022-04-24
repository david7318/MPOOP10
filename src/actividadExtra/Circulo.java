package actividadExtra;
/**
 * Clase que crea un Circulo
 * @author David Gomez, David Montoya
 */
public class Circulo extends Superficie{
    final float PI = 3.1416f;
    float radio;
    float xo,yo;
    /**
     * Constructor vacío
     */
    public Circulo() {
    }
    /**
     * Constructor que recibe parámetros
     * @param radio Radio del círculo
     * @param xo Coordenada "x" del centro del Circulo
     * @param yo Coordenada "y" del centro del Circulo
     */
    public Circulo(float radio, float xo, float yo) {
        this.radio = radio;
        this.xo = xo;
        this.yo = yo;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getXo() {
        return xo;
    }

    public void setXo(float xo) {
        this.xo = xo;
    }

    public float getYo() {
        return yo;
    }

    public void setYo(float yo) {
        this.yo = yo;
    }
    /**
     * Método que calcula el perímetro de un Circulo
     */
    public void perimetro(){
        float perimetro = 2 * PI * radio;
        System.out.println("Perimetro="+perimetro);
    }
    /**
     * Método que calcula el área de un Circulo
     */
    public void area(){
        System.out.println("Area="+(PI) * radio * radio);
    }
    /**
     * Método que cálcula el diámetro de un Circulo
     */
    public void diametro(){
        System.out.println("Diametro=" + 2*radio);
    }
}
