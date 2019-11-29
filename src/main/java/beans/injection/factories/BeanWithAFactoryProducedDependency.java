package beans.injection.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithAFactoryProducedDependency {

    @Autowired
    private FactoryProductFieldDependency factoryProductFieldDependency;

    @Autowired
    private FactoryProductConstructorDependency factoryProductConstructorDependency;

    public FactoryProductFieldDependency getFactoryProductFieldDependency() {
        return factoryProductFieldDependency;
    }

    public FactoryProductConstructorDependency getFactoryProductConstructorDependency() {
        return factoryProductConstructorDependency;
    }
}
