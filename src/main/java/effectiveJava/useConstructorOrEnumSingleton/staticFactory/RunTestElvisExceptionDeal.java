package effectiveJava.useConstructorOrEnumSingleton.staticFactory;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName RunTestElvisExceptionDeal  正常的单例模式,进行相关避免操作,防止进行反射创建对象
 * @Author licongcong
 * @Date 2021/3/10 17:28
 * @Version 1.0
 **/
public class RunTestElvisExceptionDeal {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ElvisExceptionDeal elvis1 = ElvisExceptionDeal.getInstance();
        Class<ElvisExceptionDeal> cls = ElvisExceptionDeal.class;
        Constructor<ElvisExceptionDeal> constructor=cls.getDeclaredConstructor(new Class[]{});
        constructor.setAccessible(true);
        ElvisExceptionDeal elvis2=constructor.newInstance(new Object[]{});
        System.out.println(elvis1==elvis2);
        System.out.println(elvis1);
        System.out.println(elvis2);

    }

}
