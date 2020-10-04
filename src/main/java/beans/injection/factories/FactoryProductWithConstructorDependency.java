package beans.injection.factories;

import javax.annotation.PostConstruct;

public class FactoryProductWithConstructorDependency {

    final private FactoryProductDependency factoryProductDependency;

    public boolean postConstruct;

    public FactoryProductWithConstructorDependency(FactoryProductDependency factoryProductDependency) {
        this.factoryProductDependency = factoryProductDependency;
    }

    @PostConstruct
    private void postConstruct() {
        postConstruct = true;
    }

    public FactoryProductDependency getFactoryProductDependency() {
        return factoryProductDependency;
    }
}
