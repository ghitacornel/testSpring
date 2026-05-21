package beans.files;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadInternalFilesTest extends AbstractTestSpringContext {

    @Test
    public void testRead() {
        ReadInternalFiles bean = context.getBean(ReadInternalFiles.class);
        assertEquals("custom template content", bean.readFileContent());
    }
}
