package effectiveJava.dependencyInjection.oldDemo;

/**
 * @ClassName Person
 * @Author licongcong
 * @Date 2021/3/12 10:43
 * @Version 1.0
 **/
public class Person {

    Phone phone = IPhone.getInstance();

    public void playGame() {
        phone.playGame();
    }

    public void pay() {
        phone.pay();
    }

    public void call() {
        phone.call();
    }

    public static Person getInstance() {
        return new Person();
    }



}
