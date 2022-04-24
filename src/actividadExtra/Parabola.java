package actividadExtra;
/**
 * Clase que crea una Parabola
 * @author David Gomez, David Montoya
 */
public class Parabola extends Linea{
    float h,k;
    float p;
    float a,b;
    /**
     * Constructor vacío
     */
    public Parabola() {
    }
    /**
     * Constructor que recibe parámetros
     * @param h Coordenada "x" del vértice de la Parabola
     * @param k Coordenada "y" del vértice de la Parabola
     * @param p Parámetro de la Parabola
     * @param a Constante del término cuadrático de la ecuación general de la Parabola
     * @param b Constante del término lineal de la ecuación general de la Parabola
     */
    public Parabola(float h, float k, float p, float a, float b) {
        this.h = h;
        this.k = k;
        this.p = p;
        this.a = a;
        this.b = b;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    /**
     * Método que calcula la distancia focal de una Parabola
     */
    public void distanciaFocal(){
        System.out.println("La distancia entre el foco y el vértice es = " + p/2);
    }
    /**
     * Método que calcula la longitud del lado recto de una Parabola
     */
    public void ladoRecto(){
        System.out.println("La longitud del lado recto es = " + 4*p);
    }
    /**
     * Método que calcula la ecuación del eje de una Parabola horizontal
     */
    public void eqEjeHorizontal(){
        System.out.println("La ecuación del eje de una parábola horizontal es: " + "x=" + -b/(2*a));
    }
}
