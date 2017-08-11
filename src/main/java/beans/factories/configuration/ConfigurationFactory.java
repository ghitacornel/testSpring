package beans.factories.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * this is a spring bean
 * Created by Cornel on 10.12.2015.
 */
@Configuration
public class ConfigurationFactory {

    // fields used only for test purpose
    private boolean produce1Called = false;
    private boolean produce2Called = false;

    @Bean
    public ConfigurationFactoryProduct1 produce1() {
        produce1Called = true;
        return new ConfigurationFactoryProduct1();
    }

    @Bean
    public ConfigurationFactoryProduct2 produce2() {
        produce2Called = true;
        return new ConfigurationFactoryProduct2();
    }

    public boolean isProduce1Called() {
        return produce1Called;
    }

    public boolean isProduce2Called() {
        return produce2Called;
    }
}
