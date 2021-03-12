package effectiveJava.staticMethodReplaceConstructor.serviceProviderFramework;

/**   方法返回的对象所属的类，在编写包含该静态工厂方法的类时可以不存在
 * @ClassName LoginService  四大组成之一：服务接口
 *
 *      1服务接口：这是服务提供者要去实现的接口
 *      2服务提供者接口：生成服务接口实例的工厂对象（就是用来生成服务接口的）（可选）
 *      3提供者注册API：服务者 提供服务者自身的实现
 *      4服务访问API：根据客户端指定的某种条件去实现对应的服务提供者
 *
 *
 * @Author licongcong
 * @Date 2021/3/9 15:12
 * @Version 1.0
 **/
public interface LoginService {
    
    /**
     * @Description 登录服务
     * @Author lcc 
     * @UpdateDate 2021/3/9 15:14
     * @Param []
     * @Return void
     */
    void login();

}
