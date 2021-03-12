package effectiveJava.staticMethodReplaceConstructor.ownName;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/8 16:34
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {
        Book1 book1 = new Book1("aaa");
        Book2 book2 = Book2.getInstanceByName("bbb");
        System.out.println(book1);
        System.out.println(book2);
    }

}
