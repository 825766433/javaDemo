package effectiveJava.staticMethodReplaceConstructor.returnByParamChange;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/9 14:33
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        Woman woman = Woman.getWoman(Boolean.TRUE);
        System.out.println(woman);

    }

}
