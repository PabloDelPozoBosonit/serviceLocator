package bosonit.formacion.backend.InyeccionDeDependencias.vehicle;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class Vehicle implements Serializable {

    private String type;
    public String getVehicle(){
        return type;
    }

}
