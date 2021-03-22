package effectiveJava.overrideEquals.transitivieyDemo;

import effectiveJava.overrideEquals.Point;

/**
 * @ClassName ColorPoint
 * @Author licongcong
 * @Date 2021/3/22 11:02
 * @Version 1.0
 **/
public class ColorPoint extends Point {

    private String color;

    public ColorPoint(int x, int y,String color) {
        super(x, y);
        this.color=color;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint)){
            return false;
        }
        return super.equals(obj)&&color.equals(((ColorPoint) obj).color);
    }

}
