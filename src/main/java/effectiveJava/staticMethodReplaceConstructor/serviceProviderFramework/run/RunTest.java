package effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.run;

import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.LoginService;
import effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.ServiceManager;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/9 15:31
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.run.WebServiceProvider");
        Class.forName("effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.run.PhoneServiceProvider");

        LoginService webLogin = ServiceManager.getService("webLogin");
        webLogin.login();

        LoginService phoneLogin = ServiceManager.getService("phoneLogin");
        phoneLogin.login();

    }

}
