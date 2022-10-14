package bosonit.formacion.backend.InyeccionDeDependencias.vehicle.service;

import bosonit.formacion.backend.InyeccionDeDependencias.vehicle.Vehicle;
import bosonit.formacion.backend.InyeccionDeDependencias.vehicle.registry.VehicleService;
import org.springframework.stereotype.Service;

@Service("car")
public class CarService implements VehicleService<Vehicle> {


    int numberExecution = 1;

    @Override
    public String getType() {
        return "inside CAR service, number of executions: " + (numberExecution ++);
    }
}
