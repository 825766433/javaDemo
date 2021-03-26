package effectiveJava.cautiousUseClone;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/26 16:11
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Demo demo1 = new Demo();
        demo1.setId("111");
        Demo clone = (Demo) demo1.clone();
        System.out.println(clone);
        System.out.println(demo1);
        System.out.println(clone.getId());
        System.out.println("-------------------------------");
        System.out.println("x.clone() != x:::"+(clone!=demo1));
        System.out.println("x.clone().getClass() == x.getClass:::"+(clone.getClass()==demo1.getClass()));
    }

}
