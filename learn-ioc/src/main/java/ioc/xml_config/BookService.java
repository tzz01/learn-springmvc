package ioc.xml_config;

public class BookService {
    private MyDataSource myDataSource;

    public BookService() {
    }

    public BookService(MyDataSource myDataSource) {
        this.myDataSource = myDataSource;
    }

    public MyDataSource getMyDataSource() {
        return myDataSource;
    }

    public void setMyDataSource(MyDataSource myDataSource) {
        this.myDataSource = myDataSource;
    }

    public Book getBookByName(String name) {
        return myDataSource.getBookByName(name);
    }
}
