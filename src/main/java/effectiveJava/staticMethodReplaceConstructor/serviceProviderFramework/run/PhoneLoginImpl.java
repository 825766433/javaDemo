package effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.run;

import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.LoginService;

/**
 * @ClassName PhoneLoginImpl
 * @Author licongcong
 * @Date 2021/3/9 15:28
 * @Version 1.0
 **/
public class PhoneLoginImpl implements LoginService {

    public void login() {
        System.out.println("进行移动端登陆");
    }

}
