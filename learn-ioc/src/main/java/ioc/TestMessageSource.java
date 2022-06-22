package ioc;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestMessageSource {
    public static void main(String[] args) {
        //使用当前操作系统的语言环境
        ResourceBundle rb = ResourceBundle.getBundle("i18n", Locale.getDefault());
        System.out.println(rb.getString("say"));

        //指定简体中文环境
        rb = ResourceBundle.getBundle("i18n", new Locale("zh", "CN"));
        System.out.println(rb.getString("say"));
        //通过预设指定简体英文环境
        rb = ResourceBundle.getBundle("i18n", Locale.SIMPLIFIED_CHINESE);
        System.out.println(rb.getString("say"));

        //指定美国英语
        rb = ResourceBundle.getBundle("i18n", Locale.US);
        System.out.println(rb.getString("say"));

        //使用自定义的语言环境
        Locale locale = new Locale("web", "BASE64");
        rb = ResourceBundle.getBundle("i18n", locale);
        System.out.println(rb.getString("say"));
    }
}
