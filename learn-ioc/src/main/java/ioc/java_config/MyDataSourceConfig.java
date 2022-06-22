package ioc.java_config;

import org.springframework.stereotype.Component;

@Component
public class MyDataSourceConfig {
    private String dbName = "mysql";
    private String dbUsername = "root";
    private String dbPassword = "123456";

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    @Override
    public String toString() {
        return "MyDataSourceConfig{" +
                "dbName='" + dbName + '\'' +
                ", dbUsername='" + dbUsername + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                '}';
    }
}
