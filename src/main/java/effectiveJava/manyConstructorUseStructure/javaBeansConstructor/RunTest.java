package effectiveJava.manyConstructorUseStructure.javaBeansConstructor;

/**
 * @ClassName RunTest  使用javaBeans模式可能在多线程中造成问题,对象未初始化完成
 * @Author licongcong
 * @Date 2021/3/9 17:14
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) throws InterruptedException {

        final Cat cat = new Cat();
        cat.setName("mimi");
        new Thread(new Runnable() {
            public void run() {
                System.out.println(cat.getAge());
            }
        }).start();

        Thread.sleep(5000L);

        cat.setAge("12");

        new Thread(new Runnable() {
            public void run() {
                System.out.println(cat.getAge());
            }
        }).start();

        System.out.println("Main end");

    }
}
