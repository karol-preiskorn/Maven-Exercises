import com.google.common.base.CaseFormat;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "hello world this is test"));
    }

    public String upper(String p_args){
        return(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, p_args));
    }
}
