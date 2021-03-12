package effectiveJava.useConstructorOrEnumSingleton.staticFactory;

/**
 * @ClassName ElvisExceptionDeal
 * @Author licongcong
 * @Date 2021/3/10 17:27
 * @Version 1.0
 **/
public class ElvisExceptionDeal {

    private static final ElvisExceptionDeal INSTANCE = new ElvisExceptionDeal();

    private ElvisExceptionDeal() {
        if (ElvisExceptionDeal.INSTANCE != null) {
            throw new RuntimeException("违反单例");
        }
    }

    public void leaveTheBuilding() {
        System.out.println("leaveTheBuilding()");
    }

    public static ElvisExceptionDeal getInstance() {
        return INSTANCE;
    }

}
