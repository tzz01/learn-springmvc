public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String str = (String)Class.forName("java.lang.String").newInstance();
        System.out.println(str.getClass());

    }
}
