package beans.injection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("profile 1")
public class ProfileDependency1 implements ProfileDependency {
}
