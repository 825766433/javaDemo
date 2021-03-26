package effectiveJava.overrideEqualsAlsoOverrideHashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/23 10:38
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);

        /**我没有重写hashcode(),打印出就是两个对象 ,重写后,打印一个对象*/
        HashMap<Point,String> map = new HashMap<Point,String>(16);
        map.put(point1,"1");
//        map.put(point2,"3");
        String s = map.get(point2);
        System.out.println(s);
        for (Point point : map.keySet()) {
            System.out.println(point);
        }

        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        System.out.println(1/0);

    }

}
