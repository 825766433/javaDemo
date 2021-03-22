package effectiveJava.overrideEquals;

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

    @Override
    public boolean equals(Object obj) {
//        if (!(obj instanceof Point)) {
//            return false;
//        }
        if (obj == null||obj.getClass()!=this.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }
}
