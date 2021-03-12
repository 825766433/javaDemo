package effectiveJava.privateConstructorIntensify;

import effectiveJava.useConstructorOrEnumSingleton.staticFactory.Elvis;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName RunTest
 * @Author licongcong
 * @Date 2021/3/12 10:36
 * @Version 1.0
 **/
public class RunTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<UtilityClass> utilityClassClass = UtilityClass.class;
        Constructor<UtilityClass> declaredConstructor = utilityClassClass.getDeclaredConstructor(new Class[]{});
        declaredConstructor.setAccessible(true);
        UtilityClass utilityClass = declaredConstructor.newInstance(new Object[]{});
        System.out.println(utilityClass);

    }

}
