package beans.files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

public class ReadInternalFilesTest extends AbstractTestSpringContext {

    @Test
    public void testRead() {

        ReadInternalFiles bean = context.getBean(ReadInternalFiles.class);
        Assertions.assertEquals("custom template content", bean.readFileContent());

    }
}
