package ioc.java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class JavaConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigMain.class);

        System.out.println(MyDataSourceConfig.class);
        MyDataSourceConfig myDataSourceConfig = context.getBean(MyDataSourceConfig.class);
        System.out.println(myDataSourceConfig);

    }
}
