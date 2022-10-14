package bosonit.formacion.backend.InyeccionDeDependencias.vehicle.registry;


public interface ServiceRegistry {
    public <T> VehicleService<T> getVehicle(String name);
}

