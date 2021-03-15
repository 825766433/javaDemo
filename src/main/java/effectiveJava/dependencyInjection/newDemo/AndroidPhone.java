package effectiveJava.dependencyInjection.newDemo;

/**
 * @ClassName AndroidPhone
 * @Author licongcong
 * @Date 2021/3/12 10:44
 * @Version 1.0
 **/
public class AndroidPhone implements Phone {

    @Override
    public void playGame() {
        System.out.println("用安卓手机玩游戏");
    }

    @Override
    public void pay() {
        System.out.println("用安卓手机支付112");
    }

    @Override
    public void call() {
        System.out.println("用安卓手机打电话");
    }

    public static Phone getInstance() {
        return new AndroidPhone();
    }
}
