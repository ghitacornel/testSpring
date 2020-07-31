package beans.factories;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ProductPrototype {

    public boolean createdByFactory = false;

    public boolean postConstructCalled = false;
    public boolean preDestroyCalled = false;

    public PrototypeProductComponent component;

    @PostConstruct
    private void postConstruct() {
        postConstructCalled = true;
    }

    @PreDestroy
    private void preDestroy() {
        preDestroyCalled = true;
    }

}
