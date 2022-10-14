package bosonit.formacion.backend.InyeccionDeDependencias.vehicle.config;

import bosonit.formacion.backend.InyeccionDeDependencias.vehicle.registry.ServiceRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    public FactoryBean<?> factoryBean() {
        ServiceLocatorFactoryBean myBean = new ServiceLocatorFactoryBean();
        myBean.setServiceLocatorInterface(ServiceRegistry.class);

        return myBean;
    }
}
