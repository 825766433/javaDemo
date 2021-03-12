package effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.run;

import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.LoginService;
import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.Provider;
import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.ServiceManager;

/**
 * @ClassName PhoneServiceProvider
 * @Author licongcong
 * @Date 2021/3/9 15:36
 * @Version 1.0
 **/
public class PhoneServiceProvider implements Provider {

    static {
        ServiceManager.registerProvider("phoneLogin",new PhoneServiceProvider());
    }

    public LoginService newLoginService() {
        return new PhoneLoginImpl();
    }
}
