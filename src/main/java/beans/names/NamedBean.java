package beans.names;

import org.springframework.stereotype.Component;

/**
 * bean with custom name, default is the class name with lower first letter
 * Created by Cornel on 10.12.2015.
 */
@Component(value = "SpecificBeanName")
public class NamedBean {
}
