package beans.factories.misc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryMisc {

    @Bean
    Product1 product1() {
        return new Product1();
    }

    @Bean
    Product2 product2() {
        return new Product2(product1());
    }

}
