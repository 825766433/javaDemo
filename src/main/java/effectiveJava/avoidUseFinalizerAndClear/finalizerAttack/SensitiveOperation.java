package effectiveJava.avoidUseFinalizerAndClear.finalizerAttack;

/**
 * @ClassName SensitiveOperation
 * @Author licongcong
 * @Date 2021/3/18 14:10
 * @Version 1.0
 **/
public class SensitiveOperation {

    public SensitiveOperation(){
        if(!doSecurityCheck()){
            throw new SecurityException("Security check failed!");
        }
    }

    //Security check return false
    private boolean doSecurityCheck(){
        return false;
    }

    public void storeMoney(){
        System.out.println("Store 1000000 RMB!");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
