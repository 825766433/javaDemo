package effectiveJava.overrideEquals;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/18 15:24
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {
        Demo demo = new Demo("111","aaa");
        Demo demo2 = new Demo("111","aaa");
        System.out.println(demo.equals(demo2));

    }

}
