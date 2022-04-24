package mppoop10;

/**
 * Clase principal.
 * @author David Gomez, David Montoya
 */
public class MPPOOP10 {
    public static void main(String[] args) {
        Flauta flauta=new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        InstrumentoMusical instrumento=flauta;
        instrumento.tocar();
        instrumento.afinar();
        
        double pi= Math.PI;
        System.out.println(pi);
        double e=Math.E;
        System.out.println(e);
        System.out.println(Math.abs(-100));
        
        System.out.println("El mes "+Meses.NUEVE+" corresponde a:");
        System.out.println(Meses.NOMBRE_MESES[Meses.NUEVE]);
        
        //VARIABLE QUE GUARDA LA DIMENSIÓN PARA LAS CLASES ABSTRACTAS
        //FIGURA GEÓMETRICA ES UNA INTERFAZ
        //LÍNEA, SUPERFICIE, VOLUMEN SON CLASES ABSTRACTAS Y NECESITAN UNA CONSTANTE QUE GUARDA SU DIMENSIÒN
        //LAS 9 CLASES, CADA UNA DEBE TENER 3 MÉTODOS Y 3 ATRIBUTOS PROPIOS
        
    }
    
}
