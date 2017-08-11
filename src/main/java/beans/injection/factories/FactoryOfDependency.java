package beans.injection.factories;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryOfDependency {

    private boolean used = false;

    @Bean
    FactoryProduct build() {
        used = true;
        return new FactoryProduct();
    }


    public boolean isUsed() {
        return used;
    }
}
