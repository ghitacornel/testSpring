package beans.factories;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class PrototypeProduct {

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
