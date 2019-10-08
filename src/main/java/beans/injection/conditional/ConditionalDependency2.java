package beans.injection.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ConditionalDependency2Enabled.class)
public class ConditionalDependency2 implements ConditionalDependency {
}
