package bosonit.formacion.backend.InyeccionDeDependencias.controller;

import bosonit.formacion.backend.InyeccionDeDependencias.service.BikeService;
import bosonit.formacion.backend.InyeccionDeDependencias.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VehicleController {

    @Autowired
    BikeService bikeService;
    @Autowired
    CarService carService;


    @GetMapping("{vehicle}")
    public String processGet(@PathVariable String vehicle) {

        if (vehicle.equals("bike"))
            return bikeService.process();

        else if (vehicle.equals("car"))
            return carService.process();

        else
        return "Escribe un tipo de vehiculo";
    }

}
