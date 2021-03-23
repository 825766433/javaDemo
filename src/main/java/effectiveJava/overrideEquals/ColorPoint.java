package effectiveJava.overrideEquals;

import java.util.Objects;

/**
 * @ClassName ColorPoint 复合优先于继承
 * @Author licongcong
 * @Date 2021/3/22 11:02
 * @Version 1.0
 **/
public class ColorPoint{

    private Point point;
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x,y);
        this.color=color;Objects.requireNonNull(color);
    }

    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPoint)){
            return false;
        }
        ColorPoint cp = (ColorPoint) obj;
        return cp.point.equals(point)&&cp.color.equals(color);
    }

}
