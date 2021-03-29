package effectiveJava.cautiousUseClone.copyContructor;

/**
 * @ClassName RunTest 拷贝构造器测试
 * @Author licongcong
 * @Date 2021/3/29 10:21
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {
        Demo demo = new Demo("111","aaa");
        Demo demo1 = new Demo(demo);
        Demo demo2 = Demo.newInstance(demo);
        System.out.println(demo);
        System.out.println(demo1);
        System.out.println(demo2);
    }

}
