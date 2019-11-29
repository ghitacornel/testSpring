package beans.injection.factories;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class FactoryProductFieldDependency {

    @Autowired
    private FactoryProductDependency factoryProductDependency;

    public boolean postConstruct;

    @PostConstruct
    private void postConstruct() {
        postConstruct = true;
    }

    public FactoryProductDependency getFactoryProductDependency() {
        return factoryProductDependency;
    }
}
