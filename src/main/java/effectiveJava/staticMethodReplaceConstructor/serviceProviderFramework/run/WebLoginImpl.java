package effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.run;

import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.LoginService;
import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.Provider;

/**
 * @ClassName WebLoginImpl  网页登陆实现
 * @Author licongcong
 * @Date 2021/3/9 15:26
 * @Version 1.0
 **/
public class WebLoginImpl implements LoginService {

    public void login() {
        System.out.println("进行网页登陆");
    }
}
