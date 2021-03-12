package effectiveJava.useConstructorOrEnumSingleton.field;

import java.io.Serializable;

/**
 * @ClassName Elvis
 * @Author licongcong
 * @Date 2021/3/10 10:52
 * @Version 1.0
 **/
public class Elvis implements Serializable {


    public static final Elvis elvis = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("leaveTheBuilding()");
    }

    // 不添加该方法则会出现 反序列化时出现多个实例的问题
//    public Object readResolve(){
//        return elvis;
//    }


}
