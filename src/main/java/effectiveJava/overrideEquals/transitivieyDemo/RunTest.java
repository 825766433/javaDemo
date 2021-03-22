package effectiveJava.overrideEquals.transitivieyDemo;

import effectiveJava.overrideEquals.Point;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/22 11:01
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {

        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));

        ColorPoint colorPoint1 = new ColorPoint(1, 2, "3");
        ColorPoint colorPoint2 = new ColorPoint(1, 2, "3");

        System.out.println(colorPoint1.equals(colorPoint2));
        System.out.println(point1.equals(colorPoint2));
        System.out.println(colorPoint1.equals(point2));
    }

}
