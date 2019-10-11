package beans.injection.circularfield;

import org.springframework.beans.factory.annotation.Autowired;

public class B {

    @Autowired
    C c;

}
