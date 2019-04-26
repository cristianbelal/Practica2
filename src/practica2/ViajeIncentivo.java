package practica2;

import java.util.Date;

public class ViajeIncentivo extends Viaje {

    /**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;
    //Constructor, getters and setters

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String elQuePaga) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa=elQuePaga;
    }
    
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }

    String getEmpresa() {
        return empresa;
    }
}
