package effectiveJava.dependencyInjection.bookDemo;

/**
 * @ClassName UserWork
 * @Author licongcong
 * @Date 2021/3/12 14:33
 * @Version 1.0
 **/
public class UserWork implements User {


    @Override
    public void use() {
        System.out.println("use()");
    }
}
