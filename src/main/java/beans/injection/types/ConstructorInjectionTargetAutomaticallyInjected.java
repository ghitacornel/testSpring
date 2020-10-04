package beans.injection.types;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionTargetAutomaticallyInjected {

    // no need to mark it as @Autowired
    final private ConstructorDependency constructorDependency;
    private boolean constructorUsedInInjection = false;

    // no need to mark it as @Autowired
    public ConstructorInjectionTargetAutomaticallyInjected(ConstructorDependency constructorDependency) {
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
