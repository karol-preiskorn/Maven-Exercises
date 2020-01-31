public class HelloWorld {
    public static void main(String[] args) {
        int ret = 0;
        System.out.println("Hello World");
        ret = go(2, 2);

    }

    public static int go(int p1, int p2){
        return p1 + p2;
    }
}
