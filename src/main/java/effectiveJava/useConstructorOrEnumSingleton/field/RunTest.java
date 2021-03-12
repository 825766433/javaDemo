package effectiveJava.useConstructorOrEnumSingleton.field;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/10 11:00
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {
        Elvis elvis = Elvis.elvis;
        System.out.println(elvis);
        elvis.leaveTheBuilding();
        Elvis elvis2 = Elvis.elvis;
        System.out.println(elvis2);
    }

}
