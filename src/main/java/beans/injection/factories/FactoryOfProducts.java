package beans.injection.factories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * builds products used in dependency injections
 */
@Configuration
public class FactoryOfProducts {

    public boolean usedFactoryProductWithFieldDependency = false;
    public boolean usedFactoryProductWithConstructorDependency = false;
    public boolean usedFactoryProductWithSetterDependency = false;

    @Bean
    // injections on product are performed automatically after return
    public FactoryProductWithFieldDependency factoryProductFieldDependency() {
        usedFactoryProductWithFieldDependency = true;
        return new FactoryProductWithFieldDependency();
    }

    @Bean
    // injections on factory parameters are performed automatically
    // no need to specify @Autowired on method parameter
    public FactoryProductWithConstructorDependency factoryProductConstructorDependency(FactoryProductDependency factoryProductDependency) {
        usedFactoryProductWithConstructorDependency = true;
        return new FactoryProductWithConstructorDependency(factoryProductDependency);
    }

    @Bean
    // injections on product are performed automatically after return
    public FactoryProductWithSetterDependency factoryProductSetterDependency() {
        usedFactoryProductWithSetterDependency = true;
        return new FactoryProductWithSetterDependency();
    }

}
