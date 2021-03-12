package effectiveJava.dependencyInjection.newDemo;

/**
 * @ClassName Person
 * @Author licongcong
 * @Date 2021/3/12 10:43
 * @Version 1.0
 **/
public class Person {

    Phone phone;

    public void playGame() {
        phone.playGame();
    }

    public void pay() {
        phone.pay();
    }

    public void call() {
        phone.call();
    }

    public static Person getInstance(Phone phone) {
        return new Person(phone);
    }

    // 构造方法注入
    private Person(Phone phone) {
        this.phone = phone;
    }

}
