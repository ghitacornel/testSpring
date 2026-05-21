package beans.injection.factories;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;

public class FactoryProductWithFieldDependency {

    @Autowired
    private FactoryProductDependency dependency;

    public boolean postConstruct = false;

    @PostConstruct
    private void postConstruct() {
        postConstruct = true;
    }

    public FactoryProductDependency getDependency() {
        return dependency;
    }
}
