package effectiveJava.dependencyInjection.newDemo;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/12 10:45
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) {
        Person person = Person.getInstance(new AndroidPhone());
        person.pay();
    }

}
