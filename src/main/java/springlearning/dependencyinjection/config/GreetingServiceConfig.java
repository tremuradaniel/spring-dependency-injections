package springlearning.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springlearning.dependencyinjection.services.ConstructorGreetingService;
import springlearning.dependencyinjection.services.PropertyInjectedGreetingService;
import springlearning.dependencyinjection.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
