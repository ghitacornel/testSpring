package beans.files;

import beans.properties.config.BeanWithPropertiesReferencingAFile;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        {
            ReadInternalFiles bean = context.getBean(ReadInternalFiles.class);
            String content = bean.readFileContent();
            System.out.println(content);
        }

        {
            BeanWithPropertiesReferencingAFile bean = context.getBean(BeanWithPropertiesReferencingAFile.class);
            System.out.println(Files.readAllLines(bean.getFile().toPath()));
        }
    }
}
