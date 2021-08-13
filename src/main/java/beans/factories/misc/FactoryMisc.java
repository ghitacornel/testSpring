package beans.factories.misc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryMisc {

    @Bean
    Product1 product1() {
        Product1 product1 = new Product1();
        return product1;
    }

    @Bean
    Product2 product2() {
        Product1 product1 = product1();// observe "product1" not invoked, reused same product
        return new Product2(product1);
    }

}
