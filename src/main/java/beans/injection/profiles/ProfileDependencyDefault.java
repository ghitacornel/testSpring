package beans.injection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class ProfileDependencyDefault implements ProfileDependency {
}
