package beans.injection.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanWithContextInjected {

    @Autowired
    ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }

}
