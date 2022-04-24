package actividadExtra;

/**
 * Clase que crea a un icosaedro.
 * @author David Gomez, David Montoya
 */
public class Icosaedro extends Volumen{
    private double longitudArista;
    private String color, nombre; 
    /**
     * Constructor vacío.
     */
    public Icosaedro() {
    }
    /**
     * Constructor con parámetros.
     * @param longitudArista Longitud de la arista del icosaedro.
     * @param color El color del icosaedro.
     * @param nombre El nombre de referencia del icosaedro.
     */
    public Icosaedro(double longitudArista, String color, String nombre) {
        this.longitudArista = longitudArista;
        this.color = color;
        this.nombre = nombre;
    }

    public double getLongitudArista() {
        return longitudArista;
    }

    public void setLongitudArista(double longitudArista) {
        this.longitudArista = longitudArista;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que indica cuando el icosaedro gira sobre alguno de sus ejes.
     */
    public void rotarIcosaedro(){
        System.out.println("El icosaedro gira sobre uno de sus ejes.");
    }
    
    /**
     * Método que calcula el área total del icosaedro.
     * @return Área del icosaedro.
     */
    public double calcularAreaTotal(){
        return 8.66*longitudArista*longitudArista;
    }
    
    /**
     * Método que calcula el volumen del icosaedro.
     * @return Volumen del icosaedro.
     */
    public double calcularVolumen(){
        return 2.18*longitudArista*longitudArista*longitudArista;
    }
}
