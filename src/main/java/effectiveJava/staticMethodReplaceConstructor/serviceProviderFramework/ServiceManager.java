package effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ServiceManager 这是一个服务管理器，里面包含了四大组成中的三和四
 *  *                       解释：通过注册将 服务提供者 加入map，
 *                              然后通过一个静态工厂方法 getService(String name) 返回不同的服务
 * @Author licongcong
 * @Date 2021/3/9 15:15
 * @Version 1.0
 **/
public class ServiceManager {

    //map，保存了注册的服务
    public static Map<String, Provider> providers = new HashMap<String, Provider>();

    //四大组成之三：提供者注册API  (就是注册一下服务提供者)
    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    //四大组成之四：服务访问API   (客户端只需要传递一个name参数，系统会去匹配服务提供者，然后提供服务)  (静态工厂方法)
    public static LoginService getService(String name) {
        Provider provider = providers.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("No provider registered with name=" + name);

        }
        return provider.newLoginService();
    }


}
