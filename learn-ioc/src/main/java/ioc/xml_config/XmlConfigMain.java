package ioc.xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml_config.xml");

        MyDataSourceConfig myDataSourceConfig = context.getBean(MyDataSourceConfig.class);
//        System.out.println(myDataSourceConfig);

        MyDataSource myDataSource = context.getBean(MyDataSource.class);
//        System.out.println(myDataSource);

        UserService userService =  context.getBean(UserService.class);
        BookService bookService1 = context.getBean(BookService.class);
        System.out.println(bookService1);

        BookService bookService2 = userService.getBookService();
        System.out.println(bookService2);

        if (bookService1 == bookService2) {
            System.out.println("1 == 2");
        }

        Book book = bookService1.getBookByName("语文书");
        System.out.println(book);
    }
}
