import com.google.common.base.CaseFormat;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "THIS_IS_AN_EXAMPLE_STRING"));
    }
}
