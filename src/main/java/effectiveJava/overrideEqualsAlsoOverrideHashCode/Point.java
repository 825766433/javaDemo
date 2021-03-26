package effectiveJava.overrideEqualsAlsoOverrideHashCode;

import java.util.Objects;

/**
 * @ClassName Point
 * @Author licongcong
 * @Date 2021/3/22 10:58
 * @Version 1.0
 **/
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //为什么要重写,在map,set这种key唯一的容器中,如果不重写,会对象重复,具体看Run
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof Point)) {
//            return false;
//        }
//        Point point = (Point) o;
//        return x == point.x &&
//                y == point.y;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
