package beans.injection.direct;

import org.springframework.stereotype.Component;

@Component
public class BeanWithDependenciesInjectedAutomaticallyThroughConstructor {

    // noo need to mark it as @Autowired
    final private ConstructorDependency constructorDependency;

    public BeanWithDependenciesInjectedAutomaticallyThroughConstructor(ConstructorDependency constructorDependency) {
        this.constructorDependency = constructorDependency;
    }

    public ConstructorDependency getConstructorDependency() {
        return constructorDependency;
    }
}
