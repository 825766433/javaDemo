package effectiveJava.dependencyInjection.newDemo;

/**
 * @ClassName IPhone
 * @Author licongcong
 * @Date 2021/3/12 10:41
 * @Version 1.0
 **/
public class IPhone implements Phone {
    @Override
    public void playGame() {
        System.out.println("用苹果手机玩游戏");
    }

    @Override
    public void pay() {
        System.out.println("用苹果手机支付");
    }

    @Override
    public void call() {
        System.out.println("用苹果手机打电话");
    }

    public static Phone getInstance() {
        return new IPhone();
    }
}
