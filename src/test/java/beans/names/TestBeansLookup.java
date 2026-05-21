package beans.names;

import org.junit.jupiter.api.Test;
import template.AbstractTestSpringContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestBeansLookup extends AbstractTestSpringContext {

    @Test
    public void testLookupForNamedBean() {
        NamedBean bean1 = context.getBean(NamedBean.class);// get bean by class
        assertNotNull(bean1);
        NamedBean bean2 = (NamedBean) context.getBean("SpecificBeanName");// get bean by name
        assertNotNull(bean2);
    }

    @Test
    public void testLookupForNotNamedBean() {
        NotNamedBean bean1 = context.getBean(NotNamedBean.class);// get bean by class
        assertNotNull(bean1);
        NotNamedBean bean2 = (NotNamedBean) context.getBean("notNamedBean");// get bean by name
        assertNotNull(bean2);
    }

    @Test
    public void testLookupForExtensionBean() {
        ExtensionBean bean1 = context.getBean(ExtensionBean.class);// get bean by class
        assertNotNull(bean1);
        ExtensionBean bean2 = (ExtensionBean) context.getBean("extensionBean");// get bean by name
        assertNotNull(bean2);
        TemplateBean bean3 = context.getBean(TemplateBean.class);// get bean by template parent class
        assertNotNull(bean3);
    }

}
