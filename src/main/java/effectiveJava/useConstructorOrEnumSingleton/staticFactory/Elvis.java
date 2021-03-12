package effectiveJava.useConstructorOrEnumSingleton.staticFactory;

/**
 * @ClassName Elvis


 * @Author licongcong
 * @Date 2021/3/10 11:29
 * @Version 1.0
 **/
public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("leaveTheBuilding()");
    }

    public static Elvis getInstance(){
        return INSTANCE;
    }

}
