package beans.factories.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * this is a spring bean
 * Created by Cornel on 10.12.2015.
 */
@Configuration
public class ConfigurationFactory {

    @Bean
    @Scope("prototype")
    public ConfigurationFactoryProduct1 produce1() {
        ConfigurationFactoryProduct1 product1 = new ConfigurationFactoryProduct1();
        product1.createdByConstructor = false;
        return product1;
    }

    @Bean
    @Scope("singleton")
    public ConfigurationFactoryProduct2 produce2() {
        ConfigurationFactoryProduct2 product2 = new ConfigurationFactoryProduct2();
        product2.createdByConstructor = false;
        return product2;
    }

}
