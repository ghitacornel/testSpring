package beans.injection.circularconstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

    public A(@Autowired B b) {
        this.b = b;
    }

    B b;

}
