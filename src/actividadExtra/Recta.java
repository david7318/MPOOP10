package actividadExtra;
/**
 * Clase que crea una Recta
 * @author David Gomez, David Montoya
 */
public class Recta extends Linea{
    
    double xi, xf, yi, yf;
    
    /**
     * Constructor vacio
     */
    public Recta() {
    }
    /**
     * Constructor que recibe parámetros.
     * @param xi Coordenada "x" inicial de la Recta
     * @param xf Coordenada "x" final de la Recta
     * @param yi Coordenada "y" incial de la Recta
     * @param yf Coordenada "y" final de la Recta
     */
    public Recta(double xi, double xf, double yi, double yf) {
        this.xi = xi;
        this.xf = xf;
        this.yi = yi;
        this.yf = yf;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXf() {
        return xf;
    }

    public void setXf(double xf) {
        this.xf = xf;
    }

    public double getYi() {
        return yi;
    }

    public void setYi(double yi) {
        this.yi = yi;
    }

    public double getYf() {
        return yf;
    }

    public void setYf(double yf) {
        this.yf = yf;
    }
    /**
     * Método que calcula la pendiente de la Recta
     */
    public void pendiente(){
        System.out.println("La pendiente de la recta es = " + (yf-yi)/(xf-xi));
    }
    /**
     * Método que calcula la longitud del segmento de Recta
     */
    public void longitud(){
        System.out.println("La lonigutd de la recta es = " + Math.abs(Math.sqrt(Math.pow(yf-yi, 2)+Math.pow(xf-xi, 2))));
    }
    /**
     * Método que cálcula el ángulo de inclinacion de la Recta con respecto al eje X
     */
    public void anguloInclinacion(){
        System.out.println("El ángulo de inclinación de la recta es = " + Math.atan((yf-yi)/(xf-xi)));    
    }
}
