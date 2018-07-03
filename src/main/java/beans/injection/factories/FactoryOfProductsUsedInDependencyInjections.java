package beans.injection.factories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryOfProductsUsedInDependencyInjections {

    private boolean used = false;

    /**
     * @return products used in dependency injections
     */
    @Bean
    FactoryProduct build() {
        used = true;
        return new FactoryProduct();
    }

    public boolean isUsed() {
        return used;
    }
}
