package beans.injection.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithAFactoryProducedDependency {

    @Autowired
    private FactoryProductWithFieldDependency productFieldDependency;

    @Autowired
    private FactoryProductWithConstructorDependency productConstructorDependency;

    public FactoryProductWithFieldDependency getProductFieldDependency() {
        return productFieldDependency;
    }

    public FactoryProductWithConstructorDependency getProductConstructorDependency() {
        return productConstructorDependency;
    }
}
