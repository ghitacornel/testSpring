package beans.injection.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithProfileDependency {

    @Autowired
    private ProfileDependency profileDependency;

    public ProfileDependency getProfileDependency() {
        return profileDependency;
    }

}
