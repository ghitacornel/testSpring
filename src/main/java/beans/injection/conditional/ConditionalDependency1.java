package beans.injection.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ConditionalDependency1Enabled.class)
public class ConditionalDependency1 implements ConditionalDependency {
}
