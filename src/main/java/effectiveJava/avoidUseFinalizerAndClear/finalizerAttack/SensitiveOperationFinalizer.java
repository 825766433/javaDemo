package effectiveJava.avoidUseFinalizerAndClear.finalizerAttack;

/**
 * @ClassName SensitiveOperationFinalizer 恶意子类
 * @Author licongcong
 * @Date 2021/3/18 14:15
 * @Version 1.0
 **/
public class SensitiveOperationFinalizer extends SensitiveOperation {

    public SensitiveOperationFinalizer() {
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("We can still do store Money action!");
        this.storeMoney();
        System.exit(0);
    }
}
