package beans.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Factory {

    @Bean
    @Scope("prototype")
    public PrototypeProduct producePrototype(@Autowired PrototypeProductComponent component) {
        PrototypeProduct product = new PrototypeProduct();
        product.createdByFactory = true;
        product.component = component;
        return product;
    }

    @Bean
    @Scope("singleton")// this is redundant
    public SingletonProduct produceSingleton(SingletonProductComponent component) {
        SingletonProduct product = new SingletonProduct();
        product.component = component;
        product.createdByFactory = true;
        return product;
    }

}
