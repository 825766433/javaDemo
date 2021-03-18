package effectiveJava.avoidUseFinalizerAndClear.finalizerAttack;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/18 14:11
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) throws InterruptedException {
        //正常调用会异常
//        SensitiveOperation sensitiveOperation = new SensitiveOperation();
//        sensitiveOperation.storeMoney();

        //此种方法还是会执行相关的storeMoney()
        try {
            SensitiveOperation sensitiveOperation = new SensitiveOperationFinalizer();
            sensitiveOperation.storeMoney();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.gc();


    }

}
