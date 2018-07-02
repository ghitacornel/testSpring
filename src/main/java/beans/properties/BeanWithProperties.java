package beans.properties;

import org.springframework.stereotype.Component;

/**
 * bean with injected custom properties
 */
@Component
public class BeanWithProperties {

    // these field values will be overwritten with values taken from xml file
    private String customProperty1 = "xxx";
    final private int customProperty2;

    /**
     * required by @Component
     */
    public BeanWithProperties() {
        customProperty2 = -1;
    }

    public BeanWithProperties(int customProperty2) {
        this.customProperty2 = customProperty2;
    }

    public String getCustomProperty1() {
        return customProperty1;
    }

    public void setCustomProperty1(String customProperty1) {
        this.customProperty1 = customProperty1;
    }

    public int getCustomProperty2() {
        return customProperty2;
    }

}
