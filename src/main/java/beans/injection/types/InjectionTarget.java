package beans.injection.types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * a bean with dependencies<br>
 * providing dependencies setters is optional.
 * provided dependencies setters will be used though for injection.
 * providing dependencies getters is forbidden and dangerous, because the injected resources are to be managed solely by
 * the container and not further exposed out of the means provided by the container.
 */
@Component
public class InjectionTarget {

    // no getters or setters are provided or used
    @Autowired
    private FieldDependency fieldDependency;

    // only a setters is provided and used
    private SetterDependency setterDependency;

    // only a constructor parameter is provided and used
    // no getters or setters are provided or used
    final private ConstructorDependency constructorDependency;

    // used only for template purpose
    private boolean setterUsedInInjection = false;
    private boolean constructorUsedInInjection = false;

    @Autowired
    public InjectionTarget(ConstructorDependency constructorDependency) {
        this.constructorDependency = constructorDependency;
        constructorUsedInInjection = true;
    }

    @Autowired
    public void setSetterDependency(SetterDependency setterDependency) {
        this.setterDependency = setterDependency;
        setterUsedInInjection = true;
    }

    public FieldDependency getFieldDependency() {
        return fieldDependency;
    }

    public SetterDependency getSetterDependency() {
        return setterDependency;
    }

    public ConstructorDependency getConstructorDependency() {
        return constructorDependency;
    }

    public boolean isSetterUsedInInjection() {
        return setterUsedInInjection;
    }

    public boolean isConstructorUsedInInjection() {
        return constructorUsedInInjection;
    }
}
