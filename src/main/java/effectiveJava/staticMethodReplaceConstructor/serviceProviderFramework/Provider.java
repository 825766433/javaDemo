package effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework;

/**
 * @ClassName Provider 四大组成之二：服务提供者接口
 * @Author licongcong
 * @Date 2021/3/9 15:12
 * @Version 1.0
 **/
public interface Provider {

    /**
     * @Description 登录服务的提供者。通俗点说就是：通过这个newLoginService()可以获得一个服务
     * @Author lcc
     * @UpdateDate 2021/3/9 15:14
     * @Param []
     * @Return effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework.LoginService
     */
    LoginService newLoginService();

}
