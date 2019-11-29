package beans.injection.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithAFactoryProducedDependency {

    @Autowired
    private FactoryProductFieldDependency productFieldDependency;

    @Autowired
    private FactoryProductConstructorDependency productConstructorDependency;

    public FactoryProductFieldDependency getProductFieldDependency() {
        return productFieldDependency;
    }

    public FactoryProductConstructorDependency getProductConstructorDependency() {
        return productConstructorDependency;
    }
}
