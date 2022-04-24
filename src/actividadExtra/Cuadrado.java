package actividadExtra;
/**
 * Clase que crea un Cuadrado
 * @author David Gomez, David Montoya
 */
public class Cuadrado extends Superficie{
    float x1,y1,x2,y2;
    /**
     * Constructor vacío
     */
    public Cuadrado() {
    }
    /**
     * Constructor que recibe parámetros
     * @param x1 Coordenada "x" del primer vértice del Cuadrado
     * @param y1 Coordenada "y" del primer vértice del Cuadrado
     * @param x2 Coordenada "x" del segundo vértice del Cuadrado
     * @param y2 Coordenada "y" del segundo vértice del Cuadrado
     */
    public Cuadrado(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }
    /**
     * Método que cálcula la longitud de un lado del cuadrado conociendo dos vétices contiguos de éste
     */
    public void lado(){
        System.out.println("El lado del cuadrado mide = " 
        + Math.sqrt((Math.pow(x2, 2)-Math.pow(x1, 2))+(Math.pow(y2, 2)-Math.pow(y1, 2))) );
    }
    /**
     * Método que cálcula el perímetro de un Cuadrado
     */
    public void perimetro(){
        System.out.println("El perímetro del cuadrado es = " 
        + 2*(Math.sqrt((Math.pow(x2, 2)-Math.pow(x1, 2))+(Math.pow(y2, 2)-Math.pow(y1, 2)))) + " [u]");
    }
    /**
     * Método que calcula el area de un Cuadrado
     */
    public void area(){
        System.out.println("El área del cuadrado es = " 
        + Math.pow(Math.sqrt((Math.pow(x2, 2)-Math.pow(x1, 2))+(Math.pow(y2, 2)-Math.pow(y1, 2))), 2) + " [u^2]");
    }
}
