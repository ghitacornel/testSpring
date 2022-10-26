package beans.properties.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * observe that there is no need to define specific setters for such kind of injected properties
 */
@Component
public class BeanWithPropertiesReferencingAFile {

    @Value("classpath:templates/internal_file.txt")
    private Resource resourceFile;

    @Value("classpath:templates/internal_file.txt")
    private File file;

    public Resource getResourceFile() {
        return resourceFile;
    }

    public File getFile() {
        return file;
    }
}
