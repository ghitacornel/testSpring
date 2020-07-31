package beans.injection.types;

import org.springframework.stereotype.Component;

@Component
public class InjectionTargetAutomaticallyInjected {

    // noo need to mark it as @Autowired
    final private ConstructorDependency constructorDependency;
    private boolean constructorUsedInInjection = false;

    public InjectionTargetAutomaticallyInjected(ConstructorDependency constructorDependency) {
        this.constructorDependency = constructorDependency;
        constructorUsedInInjection = true;
    }

    public ConstructorDependency getConstructorDependency() {
        return constructorDependency;
    }

    public boolean isConstructorUsedInInjection() {
        return constructorUsedInInjection;
    }
}
