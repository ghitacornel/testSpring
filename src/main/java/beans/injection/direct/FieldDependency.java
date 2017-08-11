package beans.injection.direct;

import org.springframework.stereotype.Component;

/**
 * this is a dependency for another bean. note that there is no need to have it public
 * Created by Cornel on 30.10.2015.
 */
@Component
class FieldDependency {

    public String execute() {
        return this + " executed";
    }
}
