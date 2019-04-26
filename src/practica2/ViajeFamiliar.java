package practica2;

import java.util.Date;

public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;
    //Constructor getters and setters

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int cantidadIntegrantes) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = cantidadIntegrantes;
    }
    
    public int getFamilia(){
        return familia;
    }
    public void setFamilia(){
        
    }

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
}
