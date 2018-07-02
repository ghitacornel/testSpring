package beans.factories.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationFactory {

    @Bean
    @Scope("prototype")
    public ConfigurationFactoryProduct1 produceProduct1() {
        ConfigurationFactoryProduct1 product1 = new ConfigurationFactoryProduct1();
        product1.createdBy = "produceProduct1";
        return product1;
    }

    @Bean
    @Scope("singleton")
    public ConfigurationFactoryProduct2 produceProduct2() {
        ConfigurationFactoryProduct2 product2 = new ConfigurationFactoryProduct2();
        product2.createdBy = "produceProduct2";
        return product2;
    }

}
