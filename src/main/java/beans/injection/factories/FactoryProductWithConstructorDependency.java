package beans.injection.factories;

import javax.annotation.PostConstruct;

public class FactoryProductWithConstructorDependency {

    final private FactoryProductDependency dependency;

    public boolean postConstruct = false;

    @PostConstruct
    private void postConstruct() {
        postConstruct = true;
    }

    public FactoryProductDependency getDependency() {
        return dependency;
    }

    public FactoryProductWithConstructorDependency(FactoryProductDependency dependency) {
        this.dependency = dependency;
    }

}
