package ioc.xml_config;

import java.util.ArrayList;
import java.util.List;

public class MyDataSource {
    private MyDataSourceConfig myDataSourceConfig;

    public void setMyDataSourceConfig(MyDataSourceConfig myDataSourceConfig) {
        this.myDataSourceConfig = myDataSourceConfig;
    }

    public MyDataSourceConfig getMyDataSourceConfig() {
        return myDataSourceConfig;
    }

    public Book getBookByName(String name) {
        Book book1 = new Book("语文书", "1");
        Book book2 = new Book("数学书", "2");
        Book book3 = new Book("英语书", "3");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for (Book book: bookList) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }
}
