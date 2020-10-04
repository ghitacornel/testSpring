package beans.injection.factories;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class FactoryProductWithSetterDependency {

    private FactoryProductDependency dependency;

    public boolean postConstruct = false;

    @PostConstruct
    private void postConstruct() {
        postConstruct = true;
    }

    public FactoryProductDependency getDependency() {
        return dependency;
    }

    @Autowired
    public void setDependency(FactoryProductDependency dependency) {
        this.dependency = dependency;
    }

}
