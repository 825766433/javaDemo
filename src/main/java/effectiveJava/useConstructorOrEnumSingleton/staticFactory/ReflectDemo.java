package effectiveJava.useConstructorOrEnumSingleton.staticFactory;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName ReflectDemo  通过反射创建对象,无法保证唯一
 *      私有构造器仅被调用一次，用来实例化公有的静态final域Elvis,INSTANCE，由于缺少公有的构造器，所以保证了Elvis的全局唯一性，一旦Elvis被实例化，
 *      会存在一个Elvis实例，但是客户端可以借助AccessiableObject.setAccessible方法，通过反射机制，调动私有构造器。
 * @Author licongcong
 * @Date 2021/3/10 11:10
 * @Version 1.0
 **/
public class ReflectDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, SecurityException, NoSuchMethodException, InvocationTargetException {
        Elvis elvis1 = Elvis.getInstance();
        Class<Elvis> cls = Elvis.class;
        Constructor<Elvis> constructor=cls.getDeclaredConstructor(new Class[]{});
        constructor.setAccessible(true);
        Elvis elvis2=constructor.newInstance(new Object[]{});
        System.out.println(elvis1==elvis2);
        System.out.println(elvis1);
        System.out.println(elvis2);

    }

}
