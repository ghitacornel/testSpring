package beans.injection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("profile 2")
public class ProfileDependency2 implements ProfileDependency {
}
