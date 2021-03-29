package effectiveJava.cautiousUseClone;

/**
 * @ClassName DemoExtend
 * @Author licongcong
 * @Date 2021/3/26 17:06
 * @Version 1.0
 **/
public class DemoExtend extends Demo {

    @Override
    protected Object clone() {
        return super.clone();
    }
}
