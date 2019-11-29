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
    public FactoryProduct build() {
        used = true;

        // injections on product are performed automatically
        return new FactoryProduct();
    }

    public boolean isUsed() {
        return used;
    }
}
