package actividadExtra;
/**
 * Clase que crea una Elpise
 * @author David Gomez, David Montoya
 */
public class Elipse extends Linea{
    float xo,yo;
    float a,c;
    /**
     * Constructor vacío
     */
    public Elipse() {
    }
    /**
     * Constructor que recibe parámetros.
     * @param xo Coordenada "x" del centro de la Elipse
     * @param yo Coordenada "y" del centro de la Elipse
     * @param a Longitud del eje mayor de la Elipse
     * @param c Longitud del centro al foco de la Elipse
     */
    public Elipse(float xo, float yo, float a, float c) {
        this.xo = xo;
        this.yo = yo;
        this.a = a;
        this.c = c;
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


    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    /**
     * Método que calcula la distancia focal de una Elipse
     */
    public void distanciaFocal(){
        System.out.println("La distancia entre los foco es = " + 2*c);
    }
    /**
     * Método que calcula la longitud del semi eje menor de la Elipse
     */
    public void semiEjeMenor(){
        System.out.println("La longitud del semi eje menor es = " + Math.sqrt(Math.pow(a, 2)-Math.pow(c, 2)));
    }
    /**
     * Método que calcula la excentricidad de la Elipse
     */
    public void excentricidad(){
        System.out.println("La excentricidad de la elpise es = " 
        + Math.sqrt(1-((Math.pow(Math.sqrt(Math.pow(a, 2)-Math.pow(c, 2)), 2))/(Math.pow(a, 2)))));
    }
}
