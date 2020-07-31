package beans.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Factory {

    @Bean
    @Scope("prototype")
    public ProductPrototype producePrototype(@Autowired PrototypeProductComponent component) {
        ProductPrototype product = new ProductPrototype();
        product.createdBy = "producePrototype";
        product.component = component;
        return product;
    }

    @Bean
    @Scope("singleton")// this is redundant
    public ProductSingleton produceSingleton(SingletonProductComponent component) {
        ProductSingleton product = new ProductSingleton();
        product.component = component;
        product.createdBy = "produceSingleton";
        return product;
    }

}
