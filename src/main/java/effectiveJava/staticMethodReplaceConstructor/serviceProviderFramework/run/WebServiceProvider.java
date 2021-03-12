package effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.run;

import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.LoginService;
import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.Provider;
import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.ServiceManager;

/**
 * @ClassName WebServiceProvider  网络服务提供
 * @Author licongcong
 * @Date 2021/3/9 15:29
 * @Version 1.0
 **/
public class WebServiceProvider implements Provider {

    static {
        ServiceManager.registerProvider("webLogin",new WebServiceProvider());
    }

    public LoginService newLoginService() {
        return new WebLoginImpl();
    }
}
