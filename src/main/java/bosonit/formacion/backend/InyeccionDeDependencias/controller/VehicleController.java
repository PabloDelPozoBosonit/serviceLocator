package bosonit.formacion.backend.InyeccionDeDependencias.controller;

import bosonit.formacion.backend.InyeccionDeDependencias.vehicle.Vehicle;
import bosonit.formacion.backend.InyeccionDeDependencias.vehicle.registry.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VehicleController {


    @Autowired
    private ServiceRegistry serviceRegistry;

    @GetMapping("{vehicle}")
    public String processGet(@RequestBody Vehicle vehicle) {

        return serviceRegistry.getVehicle(vehicle.getVehicle()).getType();
    }


}
