package bosonit.formacion.backend.InyeccionDeDependencias.service;

import org.springframework.stereotype.Service;

@Service("car")
public class CarService implements  AdapterService{


    int numberExecution = 1;

    @Override
    public String process() {
        return "inside CAR service, number of executions: " + (numberExecution ++);
    }
}
