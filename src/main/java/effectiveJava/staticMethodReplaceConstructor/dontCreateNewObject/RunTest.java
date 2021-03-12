package effectiveJava.staticMethodReplaceConstructor.dontCreateNewObject;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/9 11:42
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        Book instanceBook = Book.getInstanceBook();
        System.out.println(instanceBook.hashCode());
        Book instanceBook2 = Book.getInstanceBook();
        System.out.println(instanceBook2.hashCode());

    }

}
