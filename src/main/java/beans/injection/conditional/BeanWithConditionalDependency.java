package beans.injection.conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithConditionalDependency {

    @Autowired
    private ConditionalDependency conditionalDependency;

    public ConditionalDependency getConditionalDependency() {
        return conditionalDependency;
    }

}
