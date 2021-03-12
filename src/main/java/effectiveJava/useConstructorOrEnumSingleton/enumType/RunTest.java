package effectiveJava.useConstructorOrEnumSingleton.enumType;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/10 17:11
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        Elvis instance = Elvis.INSTANCE;
        instance.leaveTheBuilding();

    }

}
