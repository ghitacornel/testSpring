package beans.factories.misc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryMisc {

    @Bean
    public Product1 product1() {
        Product1 product1 = new Product1();// observe product1 only once creation and the reused
        return product1;
    }

    @Bean
    public Product2 product2() {
        Product1 product1 = product1();// observe "product1" not invoked, reused same product
        return new Product2(product1);
    }

}
