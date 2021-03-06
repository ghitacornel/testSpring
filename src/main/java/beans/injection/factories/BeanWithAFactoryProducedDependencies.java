package beans.injection.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithAFactoryProducedDependencies {

    @Autowired
    public FactoryProductWithFieldDependency productWithFieldDependency;

    @Autowired
    public FactoryProductWithConstructorDependency productWithConstructorDependency;

    @Autowired
    public FactoryProductWithSetterDependency productWithSetterDependency;

}
