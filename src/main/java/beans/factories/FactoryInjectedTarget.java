package beans.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryInjectedTarget {

    @Autowired
    Factory factory;

    @Autowired
    ProductPrototype productPrototype;

    @Autowired
    ProductSingleton productSingleton;

}
