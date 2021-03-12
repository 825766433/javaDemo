package effectiveJava.useConstructorOrEnumSingleton.staticFactory;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/10 11:32
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        Elvis elvis = Elvis.getInstance();
        System.out.println(elvis);
        elvis.leaveTheBuilding();
        Elvis elvis1 = Elvis.getInstance();
        System.out.println(elvis1);

    }

}
