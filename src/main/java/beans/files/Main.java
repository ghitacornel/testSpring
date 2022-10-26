package beans.files;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        ReadInternalFiles bean = context.getBean(ReadInternalFiles.class);
        String content = bean.readFileContent();
        System.out.println(content);
    }
}
