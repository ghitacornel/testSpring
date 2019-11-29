package beans.injection.factories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryOfProducts {

    private boolean used = false;

    /**
     * @return products used in dependency injections
     */
    @Bean
    public FactoryProductFieldDependency factoryProductFieldDependency() {
        used = true;

        // injections on product are performed automatically
        return new FactoryProductFieldDependency();

    }

    @Bean
    // injections on factory parameters are performed automatically
    public FactoryProductConstructorDependency factoryProductConstructorDependency(FactoryProductDependency factoryProductDependency) {
        used = true;
        return new FactoryProductConstructorDependency(factoryProductDependency);
    }

    public boolean isUsed() {
        return used;
    }
}
