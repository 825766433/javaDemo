package effectiveJava.staticMethodReplaceConstructor.returnSubtypeObject;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/9 14:22
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        Wood wood = Wood.getStool();
        System.out.println(wood);

    }

}
