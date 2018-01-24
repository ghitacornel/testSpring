package beans.injection.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanWithValues {

    @Value("${my.value}")
    private String customValue;

    @Value("${my.second.value}")
    private String customSecondValue;

    public String getCustomValue() {
        return customValue;
    }

    public String getCustomSecondValue() {
        return customSecondValue;
    }
}
