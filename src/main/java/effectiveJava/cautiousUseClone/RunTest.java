package effectiveJava.cautiousUseClone;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/26 16:11
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args)  {
        Demo demo1 = new Demo();
        demo1.setId("111");
        Demo clone = (Demo) demo1.clone();
        System.out.println(clone);
        System.out.println(demo1);
        System.out.println(clone.getId());
        System.out.println("-------------------------------");
        System.out.println("x.clone() != x:::"+(clone!=demo1));
        System.out.println("x.clone().getClass() == x.getClass:::"+(clone.getClass()==demo1.getClass()));
        System.out.println("x.clone().equals(x):::"+clone.equals(demo1));

        Demo demo = new Demo();
        DemoExtend demoExtend = new DemoExtend();
        //调用的其实为Demo.clone()而不是Object.clone(),得到的对象其实并不是想要的clone对象
        Object clone1 = demoExtend.clone();
        System.out.println(clone1);

        System.out.println("------------------------------");
        Map map = new HashMap<String,String>();
        map.put("111","222");

    }

}
