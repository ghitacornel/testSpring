package beans.injection.multiplecandidates;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassWithMultipleCandidatesForDependencyInjection {

    @Autowired
    DependencyWithMultipleCandidates dependencyWithMultipleCandidates;

}
