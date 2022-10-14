package bosonit.formacion.backend.InyeccionDeDependencias.vehicle.service;

import bosonit.formacion.backend.InyeccionDeDependencias.vehicle.Vehicle;
import bosonit.formacion.backend.InyeccionDeDependencias.vehicle.registry.VehicleService;
import org.springframework.stereotype.Service;

@Service("bike")
public class BikeService  implements VehicleService<Vehicle> {

    int numberExecution = 1;

    @Override
    public String getType() {

        return "inside BIKE service, number of executions: " + (numberExecution ++);
    }
}
