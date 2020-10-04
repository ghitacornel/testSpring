package beans.injection.factories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryOfProducts {

    public boolean usedFactoryProductWithFieldDependency = false;
    public boolean usedFactoryProductWithConstructorDependency = false;

    /**
     * @return products used in dependency injections
     */
    @Bean
    public FactoryProductWithFieldDependency factoryProductFieldDependency() {
        usedFactoryProductWithFieldDependency = true;

        // injections on product are performed automatically
        return new FactoryProductWithFieldDependency();

    }

    @Bean
    // injections on factory parameters are performed automatically
    public FactoryProductWithConstructorDependency factoryProductConstructorDependency(FactoryProductDependency factoryProductDependency) {
        usedFactoryProductWithConstructorDependency = true;
        return new FactoryProductWithConstructorDependency(factoryProductDependency);
    }

}
