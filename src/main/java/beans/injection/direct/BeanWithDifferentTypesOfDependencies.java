package beans.injection.direct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * a bean with dependencies. note that private dependencies are resolved even without provided setters.
 */
@Component
public class BeanWithDifferentTypesOfDependencies {

    // no getters or setters provided or used
    @Autowired
    private FieldDependency fieldDependency;

    // only setters provided and used
    private SetterDependency setterDependency;

    // only constructor parameter provided and used, no getters or setters provided or used
    final private ConstructorDependency constructorDependency;

    // used only for template purpose
    private boolean setterUsedInInjection = false;
    private boolean constructorUsedInInjection = false;

    @Autowired
    public BeanWithDifferentTypesOfDependencies(ConstructorDependency constructorDependency) {
        this.constructorDependency = constructorDependency;
        constructorUsedInInjection = true;
    }

    public boolean areDependenciesResolved() {

        if (fieldDependency == null) return false;
        if (!fieldDependency.execute().equals(fieldDependency + " executed")) {
            throw new RuntimeException("fieldDependency not resolved as expected");
        }

        if (setterDependency == null) return false;
        if (setterUsedInInjection == false) {
            throw new RuntimeException("setterDependency didn't use the setter");
        }
        if (!setterDependency.execute().equals(setterDependency + " executed")) {
            throw new RuntimeException("setterDependency not resolved as expected");
        }

        if (constructorDependency == null) return false;
        if (constructorUsedInInjection == false) {
            throw new RuntimeException("constructorDependency didn't use the constructor");
        }
        if (!constructorDependency.execute().equals(constructorDependency + " executed")) {
            throw new RuntimeException("constructorDependency not resolved as expected");
        }

        return true;
    }

    @Autowired
    public void setSetterDependency(SetterDependency setterDependency) {
        this.setterDependency = setterDependency;
        setterUsedInInjection = true;
    }
}
