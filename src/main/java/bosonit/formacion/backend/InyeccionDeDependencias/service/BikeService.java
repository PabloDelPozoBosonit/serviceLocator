package bosonit.formacion.backend.InyeccionDeDependencias.service;

import org.springframework.stereotype.Service;

@Service("bike")
public class BikeService  implements AdapterService{

    int numberExecution = 1;

    @Override
    public String process() {
        return "inside BIKE service, number of executions: " + (numberExecution ++);
    }
}
